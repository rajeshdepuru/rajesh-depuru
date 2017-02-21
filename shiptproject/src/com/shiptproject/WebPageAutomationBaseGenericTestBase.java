package com.shiptproject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public abstract class WebPageAutomationBaseGenericTestBase {
	protected String baseUrl;
	protected WebDriver driver;
	protected String dealerId;
	protected String searchvalue;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@BeforeClass(alwaysRun = true)
	@Parameters({ "browser" })
	public void setUp(@Optional("chrome") String browser) throws Exception {

		// IE and Chrome Setup
		if (browser.equalsIgnoreCase("ie")) {
			DesiredCapabilities capabilities = DesiredCapabilities
					.internetExplorer();
			capabilities.setCapability("ignoreZoomSetting", true);
			System.setProperty("webdriver.ie.driver",
					System.getProperty("user.dir")
					+ "/drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver(capabilities);
		} else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")
					+ "/drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}

		baseUrl = "https://www.shipt.com/";

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			Assert.fail(verificationErrorString);
		}
	}

}
