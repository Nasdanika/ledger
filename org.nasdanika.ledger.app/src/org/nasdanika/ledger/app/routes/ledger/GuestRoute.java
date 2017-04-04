package org.nasdanika.ledger.app.routes.ledger;

import org.nasdanika.cdo.security.Guest;
import org.nasdanika.cdo.security.LoginPasswordCredentials;
import org.nasdanika.cdo.web.CDOTransactionHttpServletRequestContext;
import org.nasdanika.core.ContextParameter;
import org.nasdanika.html.Bootstrap;
import org.nasdanika.html.Form;
import org.nasdanika.html.Form.Method;
import org.nasdanika.html.Fragment;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.Tag.TagName;
import org.nasdanika.web.Action;
import org.nasdanika.web.QueryParameter;
import org.nasdanika.web.RequestMethod;
import org.nasdanika.web.RouteMethod;
import org.nasdanika.web.RouteMethod.Lock.Type;
import org.nasdanika.web.TargetParameter;

public class GuestRoute extends RouteBase<Guest> implements GuestRenderer {

	public GuestRoute() throws Exception {
		super();
	}
	
	@RouteMethod(
			path="index.html", 
			value = { RequestMethod.GET, RequestMethod.POST },
			lock = @RouteMethod.Lock(type = Type.READ, path = ".."), 
			comment="Renders login form on GET, processes it on POST")
	public Object indexHtml(
			@ContextParameter CDOTransactionHttpServletRequestContext<LoginPasswordCredentials> context, 
			@TargetParameter Guest target,
			@QueryParameter("url") String returnURL,
			@QueryParameter("login") String login,
			@QueryParameter("password") String password) throws Exception {
			
		
		Form loginForm = processLogin(context, returnURL, login, password);
		if (loginForm == null) {
			return Action.NOP;
		}
		
		loginForm
			.action("index.html")
			.method(Method.post)
			.bootstrap().grid().col(Bootstrap.DeviceSize.EXTRA_SMALL, 12)
			.bootstrap().grid().col(Bootstrap.DeviceSize.SMALL, 12)
			.bootstrap().grid().col(Bootstrap.DeviceSize.MEDIUM, 9)
			.bootstrap().grid().col(Bootstrap.DeviceSize.LARGE, 7);
		
		HTMLFactory htmlFactory = getHTMLFactory(context);
		Fragment content = htmlFactory.fragment();		
		content.content(content.getFactory().tag(TagName.h3, getResourceString(context, "logIn")));
		content.content(loginForm);
				
		return renderPage(context, target, getResourceString(context, "logIn"), content);				
	}
	
	@Override
	public Object renderLeftPanel(CDOTransactionHttpServletRequestContext<LoginPasswordCredentials> context, Guest obj)	throws Exception {
		return null;
	}

}