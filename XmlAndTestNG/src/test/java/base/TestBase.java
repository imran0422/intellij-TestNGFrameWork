package base;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import Action.ChangeDeliveryAction;
import Action.loginPageAction;
import Action.trackingPageAction;

public class TestBase {

	public WebDriver driver;

//	@Parameters({ "browser" })
	@BeforeMethod
	//@Optional("Chrome") String browser
	public void beforeMethod() throws Exception {

//		Thread.sleep(2000);
//
//		if (browser.equalsIgnoreCase("Firefox")) {
//			driver = new FirefoxDriver();
//		} else if (browser.equalsIgnoreCase("Chrome")) {
//			driver = new ChromeDriver();
//
//		} else if (browser.equalsIgnoreCase("edge")) {
//			driver = new EdgeDriver();
//
//		}
		System.setProperty("webdriver.chrome.driver", "C:\\ForSelenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.ups.com/us/en/Home.page");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

	public loginPageAction getActions() {
		return new loginPageAction(driver);
	}

	public trackingPageAction TrTest() {
		return new trackingPageAction(driver);
	}

	public ChangeDeliveryAction links() {
		return new ChangeDeliveryAction(driver);
	}

}
