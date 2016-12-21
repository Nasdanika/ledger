package org.nasdanika.ledger.ui.driver.actors;

import org.nasdanika.ledger.ui.driver.pages.LedgerPageFactory;
import org.openqa.selenium.WebDriver;

public interface LedgerActorFactory {
	
	LedgerPageFactory getPageFactory();
	
	LedgerActor createLedgerActor(WebDriver webDriver);

}
