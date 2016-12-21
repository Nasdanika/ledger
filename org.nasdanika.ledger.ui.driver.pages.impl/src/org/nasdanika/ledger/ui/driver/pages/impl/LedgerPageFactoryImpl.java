package org.nasdanika.ledger.ui.driver.pages.impl;

import org.nasdanika.ledger.ui.driver.pages.LedgerPageFactory;
import org.nasdanika.ledger.ui.driver.pages.LedgerPage;
import org.openqa.selenium.WebDriver;
import org.nasdanika.webtest.WebTestUtil;
import org.osgi.service.component.ComponentContext;

public class LedgerPageFactoryImpl implements LedgerPageFactory {

	private String baseURL;
	
	public void activate(ComponentContext context) {
		baseURL = (String) context.getProperties().get("base-url");
		System.out.println("Page factory component activated with base URL '"+baseURL+"'");
	}
	
	public void setBaseURL(String baseURL) {
		this.baseURL = baseURL;
	}
	
	@Override
	public LedgerPage createLedgerPage(WebDriver webDriver) {
		LedgerPageImpl ret = WebTestUtil.initElements(webDriver, LedgerPageImpl.class);
		ret.setFactory(this);
		return ret;
	}
	
	public String getBaseURL() {
		return baseURL;
	}

}
