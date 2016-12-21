package org.nasdanika.ledger.ui.driver.actors.impl;

import org.nasdanika.ledger.ui.driver.actors.LedgerActor;
import org.nasdanika.ledger.ui.driver.actors.LedgerActorFactory;
import org.nasdanika.ledger.ui.driver.pages.LedgerPage;
import org.nasdanika.webtest.Description;
import org.nasdanika.webtest.Page;
import org.nasdanika.webtest.Screenshot;
import org.openqa.selenium.WebDriver;

class LedgerActorImpl implements LedgerActor {

	private LedgerActorFactory factory;
	private Page<WebDriver> currentPage;
	private WebDriver webDriver;

	LedgerActorImpl(LedgerActorFactory factory, WebDriver webDriver) {
		this.factory = factory;
		this.webDriver = webDriver;
	}

	@Override
	public Page<WebDriver> getCurrentPage() {
		return currentPage;
	}
	
	@Override		
	@Description("Navigates to LedgerPage")
	@Screenshot({Screenshot.When.AFTER, Screenshot.When.EXCEPTION})
	public LedgerPage navigateToLedgerPage() {
		webDriver.get("http://localhost:8080/ledger/router/ledger.html");
		LedgerPage ret = factory.getPageFactory().createLedgerPage(webDriver);
		
		return ret;
	}

}
