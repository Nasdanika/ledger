package org.nasdanika.ledger.tests;

import java.awt.GraphicsEnvironment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.fail;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.nasdanika.webtest.Description;
import org.nasdanika.webtest.NasdanikaParameterizedWebTestRunner;
import org.nasdanika.webtest.Screenshot;
import org.nasdanika.webtest.WebTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

@RunWith(NasdanikaParameterizedWebTestRunner.class)
@Description("Tests LedgerRoute")
public class LedgerRouteTest implements WebTest<WebDriver> {
	
	public enum DriverType { firefox, chrome, ie, phantomjs } 
	
	private WebDriver driver;
		
	@Parameters(name="{index}: {0}")
	public static Collection<Object[]> registrationData() {
		List<Object[]> ret = new ArrayList<>();
		ret.add(new Object[] { GraphicsEnvironment.isHeadless() ? DriverType.phantomjs : DriverType.firefox }); // TODO Add other browsers
		return ret;
	}
	
	@Parameter(0)
	public DriverType driverType;
	
	@Override
	public WebDriver getWebDriver() {
		return driver;
	}

	@Before
	public void setUp() throws Exception {
		switch (driverType) {
		case firefox:
	        driver = new FirefoxDriver();
	        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			break;
		case phantomjs:
	        driver = new PhantomJSDriver();
	        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			break;
		default:
			fail("Unsupported driver type: ");		
		}
	}
	
	@Test
	@Description("Ledger Route")
	@Screenshot({Screenshot.When.AFTER, Screenshot.When.EXCEPTION})
	public void appRoute() throws Exception {
		getWebDriver().get("http://localhost:8080/ledger/router/ledger.html");
		//new WebDriverWait(getWebDriver(), 20).until(ExpectedConditions.visibilityOfElementLocated(By.id("button-groups")));		
	}
	
	@After
	public void quitDriver() throws Exception {
		if (driver!=null) {
	        driver.quit();
	        driver = null;
		}
	}

	@Override
	public long getScreenshotDelay() {
		return 0;
	}
	
}
