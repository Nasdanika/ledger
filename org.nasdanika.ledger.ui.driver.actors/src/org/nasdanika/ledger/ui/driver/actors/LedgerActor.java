package org.nasdanika.ledger.ui.driver.actors;

import org.nasdanika.ledger.ui.driver.pages.LedgerPage;
import org.nasdanika.webtest.Actor;
import org.nasdanika.webtest.Description;
import org.openqa.selenium.WebDriver;

@Description("Ledger Actor")
public interface LedgerActor extends Actor<WebDriver> {
	
	@Description("Navigates to LedgerPage")
	LedgerPage navigateToLedgerPage();

}
