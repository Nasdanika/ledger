package org.nasdanika.ledger.ui.driver.actors.impl;

import org.nasdanika.ledger.ui.driver.pages.LedgerPageFactory;
import org.nasdanika.ledger.ui.driver.actors.LedgerActorFactory;
import org.nasdanika.ledger.ui.driver.actors.LedgerActor;
import org.nasdanika.webtest.WebTestUtil;
import org.openqa.selenium.WebDriver;
import org.osgi.service.component.ComponentContext;

public class LedgerActorFactoryImpl implements LedgerActorFactory {

	private LedgerPageFactory pageFactory;

	public void setPageFactory(LedgerPageFactory pageFactory) {
		this.pageFactory = WebTestUtil.proxyPageFactory(pageFactory);
	}

	@Override
	public LedgerActor createLedgerActor(WebDriver webDriver) {
		return new LedgerActorImpl(this, webDriver);
	}
	
	// For troubleshooting
	public void activate(ComponentContext context) {
		System.out.println("Ledger Actor Factory Component activated");
	}

	@Override
	public LedgerPageFactory getPageFactory() {
		return pageFactory;
	}

}
