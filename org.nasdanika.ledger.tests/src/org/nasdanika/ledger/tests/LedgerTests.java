package org.nasdanika.ledger.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import org.nasdanika.webtest.NasdanikaWebTestSuite;
import org.nasdanika.webtest.ResultsModel;
import org.nasdanika.webtest.Title;

@RunWith(NasdanikaWebTestSuite.class)
@Title("Ledger test report")
@SuiteClasses({LedgerTest.class, LedgerRouteTest.class})
@ResultsModel(outputDir="../org.nasdanika.ledger.tests.results/model")
public class LedgerTests {
	
}
