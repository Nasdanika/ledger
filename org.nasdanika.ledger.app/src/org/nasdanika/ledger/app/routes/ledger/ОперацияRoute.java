package org.nasdanika.ledger.app.routes.ledger;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.codec.binary.Hex;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.cdo.security.LoginPasswordCredentials;
import org.nasdanika.cdo.web.CDOTransactionHttpServletRequestContext;
import org.nasdanika.html.Fragment;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.Tag.TagName;
import org.nasdanika.ledger.LedgerPackage;
import org.nasdanika.ledger.Операция;

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
	protected Object renderPage(CDOTransactionHttpServletRequestContext<LoginPasswordCredentials> context, Операция obj, String title, Object content) throws Exception {
		EClass provodkaEClass = LedgerPackage.Literals.ПРОВОДКА;
		String encodedPackageNsURI = Hex.encodeHexString(provodkaEClass.getEPackage().getNsURI().getBytes(/* UTF-8? */));		
		if (content instanceof Fragment && context.getRequest().getPathInfo().endsWith("/feature/проводки/create/"+encodedPackageNsURI+"/"+provodkaEClass.getName()+".html")) {
			// Добавляем скрипт
			Fragment contentFragment = (Fragment) content;
			HTMLFactory htmlFactory = contentFragment.getFactory();
			Map<String, Object> env = new HashMap<>();
			// счёт
			env.put("счёт", "'L13'"); // Новая проводка.
			// актив
			env.put("актив", ""); // Новая проводка.
			// счета
			
//			env.put("счета", accounts.toString());
			
			contentFragment.content(htmlFactory.tag(TagName.script, htmlFactory.interpolate(ОперацияRoute.class.getResource("СчётАктивПроводки.js"), env)));
		}
		return super.renderPage(context, obj, title, content);
	}

}
