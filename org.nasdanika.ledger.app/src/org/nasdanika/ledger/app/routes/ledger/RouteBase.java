package org.nasdanika.ledger.app.routes.ledger;

import org.apache.commons.lang3.StringEscapeUtils;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.cdo.security.LoginPasswordCredentials;
import org.nasdanika.cdo.security.Principal;
import org.nasdanika.cdo.web.CDOTransactionHttpServletRequestContext;
import org.nasdanika.cdo.web.routes.app.Route;
import org.nasdanika.html.Bootstrap.Glyphicon;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.Navbar;
import org.nasdanika.html.Tag;
import org.nasdanika.html.Theme;
import org.nasdanika.html.UIElement.Event;
import org.nasdanika.ledger.Пользователь;
import org.osgi.framework.FrameworkUtil;

/**
 * Base class for routes defined in the package.
 * @generated
 */
public class RouteBase<T extends EObject>
		extends Route<CDOTransactionHttpServletRequestContext<LoginPasswordCredentials>, T> implements RendererBase<T> {
	/**
	 * @generated
	 */
	protected RouteBase() throws Exception {
		super(FrameworkUtil.getBundle(RouteBase.class).getBundleContext());

	}

	@Override
	protected Theme getTheme(CDOTransactionHttpServletRequestContext<LoginPasswordCredentials> context, T obj)
			throws Exception {
		for (Principal principal : context.getPrincipals()) {
			if (principal instanceof Пользователь) {
				return ((Пользователь) principal).getTheme();
			}
		}
		return super.getTheme(context, obj);
	}

	@Override
	protected Object renderHeader(CDOTransactionHttpServletRequestContext<LoginPasswordCredentials> context, T obj)
			throws Exception {
		for (Principal principal : context.getPrincipals()) {
			if (principal instanceof Пользователь) {
				Пользователь пользователь = (Пользователь) principal;
				HTMLFactory htmlFactory = getHTMLFactory(context);
				Navbar navbar = htmlFactory.navbar(пользователь.getНаименование(),
						context.getObjectPath(principal) + "/" + INDEX_HTML);
				String logOutText = getResourceString(context, "logOut");
				Tag logOutLink = htmlFactory.link("#", logOutText);
				String logOutConfirmationMessage = StringEscapeUtils
						.escapeEcmaScript(getResourceString(context, "logOutConfirmation"));
				logOutLink.on(Event.click, "if (confirm('" + logOutConfirmationMessage + "')) window.location='"
						+ context.getObjectPath(principal) + "/logout.html" + "';return false;");
				navbar.item(logOutLink, false, true);

				Tag docLink = htmlFactory
						.link(context.getRequest().getContextPath() + "/router/doc.html",
								htmlFactory.glyphicon(Glyphicon.question_sign))
						.attribute("target", "nasdanika_ledger_documentation");
				navbar.item(docLink, false, true);

				return navbar;
			}
		}
		return super.renderHeader(context, obj);
	}

}
