package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.ModelBase;

public class ChangeDeliveryModel extends ModelBase {

	public ChangeDeliveryModel(WebDriver driver) {
		super(driver);

	}

	WebElement Tracking = null;
	WebElement ChangeDelevary = null;
	WebElement EmailLink = null;
	WebElement assertEmailLink = null;
	WebElement CallUs = null;
	WebElement assertCallUs = null;
	WebElement SelectAllCnt = null;
	WebElement assertSelectAllCnt = null;
	WebElement HelpSupport = null;
	WebElement GetStartedUps = null;
	WebElement ClaimsDbord = null;
	WebElement assertClaimsDbord =null;
	public WebElement Tracking() {
		Tracking = driver.findElement(By.id("ups-menuLinks0"));
		return Tracking;
	}

	public WebElement ChangeDelevary() {
		ChangeDelevary = driver.findElement(By.xpath(
				"//li[@class='ups-navMenu ups-menu ups-active']" + "//div[@class='ups-menu_listCols']//div[1]//ul[1]"));
		return ChangeDelevary;
	}

	public WebElement EmailLink() {
		EmailLink = driver.findElement(By.linkText("Email Us"));
		return EmailLink;
	}

	public WebElement CallUs() {
		CallUs = driver.findElement(By.linkText("Call Us"));
		return CallUs;
	}

	public WebElement SelectAllCnt() {
		SelectAllCnt = driver.findElement(By.xpath("//a[contains(text(),'See All Contact Options')]"));
		return SelectAllCnt;
	}

	public WebElement HelpSupport() {
		HelpSupport = driver.findElement(
				By.xpath("//ul[@class='ups-secnavExtn-links']//a[contains(text()," + "'Help and Support Center')]"));
		return HelpSupport;
	}

	public WebElement GetStartedUps() {
		GetStartedUps = driver.findElement(
				By.xpath("//ul[@class='ups-secnavExtn-links']//" + "a[contains(text(),'Get Started with UPS')]"));
		return GetStartedUps;
	}

	public WebElement ClaimsDbord() {
		ClaimsDbord = driver.findElement(By.xpath("//a[contains(text(),'Claims Dashboard')]"));
		return ClaimsDbord;
	}

	public WebElement assertEmailLink() {
		assertEmailLink = driver.findElement(By.xpath("//h2[contains(text(),'E-mail UPS')]"));
		return assertEmailLink;
	}

	public WebElement assertCallUs() {
		assertCallUs = driver.findElement(
				By.xpath("//div[@class='ups-page-title_cell']//" + "span[contains(text(),'Contact UPS')]"));
		return assertCallUs;
	}

	public WebElement assertSelectAllCnt() {
		assertSelectAllCnt = driver.findElement(By.xpath("//img[@class='align-left']"));
		return assertSelectAllCnt;
 
	}
	public WebElement assertClaimsDbord() {
		assertClaimsDbord= driver.findElement(By.xpath("//span[contains(text(),'Claims Dashboard')]"));
		return assertClaimsDbord;
	}
}
