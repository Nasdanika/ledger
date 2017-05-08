package org.nasdanika.ledger.app.routes.ledger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.codec.binary.Hex;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.json.JSONArray;
import org.json.JSONObject;
import org.nasdanika.cdo.security.LoginPasswordCredentials;
import org.nasdanika.cdo.web.CDOIDCodec;
import org.nasdanika.cdo.web.CDOTransactionHttpServletRequestContext;
import org.nasdanika.html.Fragment;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.Tag.TagName;
import org.nasdanika.ledger.LedgerPackage;
import org.nasdanika.ledger.Актив;
import org.nasdanika.ledger.Операция;
import org.nasdanika.ledger.Счёт;

/**
 * @generated
 */
public class ОперацияRoute extends RouteBase<Операция> implements ОперацияRenderer<Операция> {
	/**
	 * @generated
	 */
	public ОперацияRoute() throws Exception {
		super();

	}

	/**
	 * Добавляем knockout скрипт в форму создания проводки.
	 */
	@Override
	protected Object renderPage(CDOTransactionHttpServletRequestContext<LoginPasswordCredentials> context, Операция obj,
			String title, Object content) throws Exception {
		EClass provodkaEClass = LedgerPackage.Literals.ПРОВОДКА;
		String encodedPackageNsURI = Hex
				.encodeHexString(provodkaEClass.getEPackage().getNsURI().getBytes(/* UTF-8? */));
		if (content instanceof Fragment && context.getRequest().getPathInfo().endsWith(
				"/feature/проводки/create/" + encodedPackageNsURI + "/" + provodkaEClass.getName() + ".html")) {
			// Добавляем скрипт
			Fragment contentFragment = (Fragment) content;
			HTMLFactory htmlFactory = contentFragment.getFactory();
			Map<String, Object> env = new HashMap<>();
			// счёт
			env.put("счёт", ""); // Новая проводка.
			// актив
			env.put("актив", ""); // Новая проводка.
			// счета
			JSONObject активыСчетов = new JSONObject();
			TreeIterator<EObject> tit = obj.eContainer().eAllContents();
			while (tit.hasNext()) {
				EObject next = tit.next();
				if (next instanceof Счёт && !((Счёт) next).isГруппа()) {
					List<Актив> активы = new ArrayList<>();
					for (Актив актив : ((Счёт) next).getАктивы()) {
						if (актив.isГруппа()) {
							активы.addAll(актив.getСубАктивы());
						} else {
							активы.add(актив);
						}
					}
					активы.sort((a, b) -> a.getНаименование().compareTo(b.getНаименование()));
					JSONArray jAssets = new JSONArray();
					for (Актив актив: активы) {
						JSONObject jAsset = new JSONObject();
						jAsset.put("наименование", актив.getНаименование());
						jAsset.put("cdoID", CDOIDCodec.INSTANCE.encode(context, актив.cdoID()));	
						jAssets.put(jAsset);
					}					
					активыСчетов.put(CDOIDCodec.INSTANCE.encode(context, ((Счёт) next).cdoID()), jAssets);
				}
			}

			env.put("активыСчетов", активыСчетов.toString());

			contentFragment.content(htmlFactory.tag(TagName.script,
					htmlFactory.interpolate(ОперацияRoute.class.getResource("СчётАктивПроводки.js"), env)));
		}
		return super.renderPage(context, obj, title, content);
	}

}
