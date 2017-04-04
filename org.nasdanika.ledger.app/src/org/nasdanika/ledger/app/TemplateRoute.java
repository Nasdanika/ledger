package org.nasdanika.ledger.app;

import org.nasdanika.cdo.web.routes.EDispatchingRoute;
import org.nasdanika.core.ContextParameter;
import org.nasdanika.html.Bootstrap.Style;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.web.HttpServletRequestContext;
import org.nasdanika.web.Resource;
import org.nasdanika.web.RouteMethod;
import org.osgi.framework.FrameworkUtil;

@Resource(
		value="/", 
		bundle="org.nasdanika.web.resources", 
		path="resources", 
		comment="Web Resources")
public class TemplateRoute extends EDispatchingRoute {


	public TemplateRoute() throws Exception {
		super(FrameworkUtil.getBundle(org.nasdanika.cdo.web.CDOTransactionHttpServletRequestContext.class).getBundleContext());	
	}

	@RouteMethod
	public Object getIndexHtml(@ContextParameter HttpServletRequestContext context) throws Exception {		
		HTMLFactory htmlFactory = HTMLFactory.INSTANCE;
		
		return htmlFactory.alert(Style.INFO, true, "Hello!");
	}
		
	
}
