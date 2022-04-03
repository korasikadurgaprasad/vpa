package stepsdefinations;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import base.BaseUtilities;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hook extends BaseUtilities {

	private BaseUtilities base;

	public Hook(BaseUtilities base) {
		this.base = base;
	}

	@Before
	public void InitializeTest(Scenario scenario) {
		//base.scenarioDef = base.features.createNode(scenario.getName());
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless");
		base.Driver = new ChromeDriver(chromeOptions);
	}

	@After
	public void TearDownTest(Scenario scenario) {
		if (scenario.isFailed()) {
			// Take screenshot logic goes here
			System.out.println(scenario.getName());
		}
		System.out.println("Closing the browser : MOCK");
		base.Driver.quit();
	}

	@BeforeStep
	public void BeforeEveryStep(Scenario scenario) {
		System.out.println("Before every step " + scenario.getId());
	}

	@AfterStep
	public void AfterEveryStep(Scenario scenario) throws NoSuchFieldException, IllegalAccessException {
		// System.out.println("Before every step " + stepTestStep.getId());
	}

}
