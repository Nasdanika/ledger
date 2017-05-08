package org.nasdanika.ledger.app.routes.ledger;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.codec.binary.Hex;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.cdo.security.LoginPasswordCredentials;
import org.nasdanika.cdo.web.CDOIDCodec;
import org.nasdanika.cdo.web.CDOTransactionHttpServletRequestContext;
import org.nasdanika.html.Fragment;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.Tag.TagName;
import org.nasdanika.ledger.LedgerPackage;
import org.nasdanika.ledger.Операция;
import org.nasdanika.ledger.Проводка;

/**
 * @generated
 */
public class ПроводкаRoute extends RouteBase<Проводка> implements ПроводкаRenderer<Проводка> {
	/**
	 * @generated
	 */
	public ПроводкаRoute() throws Exception {
		super();

	}

	/**
	 * Добавляем knockout скрипт в форму создания проводки.
	 */
	@Override
	protected Object renderPage(CDOTransactionHttpServletRequestContext<LoginPasswordCredentials> context, Проводка obj,
			String title, Object content) throws Exception {
		if (content instanceof Fragment && context.getRequest().getPathInfo().endsWith("/edit.html")) {
			// Добавляем скрипт
			Fragment contentFragment = (Fragment) content;
			HTMLFactory htmlFactory = contentFragment.getFactory();
			Map<String, Object> env = new HashMap<>();
			// счёт
			env.put("счёт", obj.getСчёт() == null ? ""
					: "'" + CDOIDCodec.INSTANCE.encode(context, obj.getСчёт().cdoID()) + "'");
			// актив
			env.put("актив", obj.getАктив() == null ? ""
					: "'" + CDOIDCodec.INSTANCE.encode(context, obj.getАктив().cdoID()) + "'");
			// счета

			//			env.put("счета", accounts.toString());

			contentFragment.content(htmlFactory.tag(TagName.script,
					htmlFactory.interpolate(ОперацияRoute.class.getResource("СчётАктивПроводки.js"), env)));
		}
		return super.renderPage(context, obj, title, content);
	}

}
