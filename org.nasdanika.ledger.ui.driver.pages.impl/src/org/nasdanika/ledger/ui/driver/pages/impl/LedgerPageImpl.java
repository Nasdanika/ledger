package org.nasdanika.ledger.ui.driver.pages.impl;

import org.nasdanika.ledger.ui.driver.pages.LedgerPage;
import org.nasdanika.webtest.ReflectivePageBase;
import org.nasdanika.webtest.Wait;
import org.openqa.selenium.WebDriver;


@Wait(id="button-groups")
public class LedgerPageImpl extends ReflectivePageBase<WebDriver> implements LedgerPage {
		
	private LedgerPageFactoryImpl factory;
	private WebDriver webDriver;	

	public LedgerPageImpl(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	public void setFactory(LedgerPageFactoryImpl factory) {
		this.factory = factory;
	}
	
	@Override
	public WebDriver getWebDriver() {
		return webDriver;
	}

}
