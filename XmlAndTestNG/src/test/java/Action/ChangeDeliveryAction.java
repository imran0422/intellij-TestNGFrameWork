package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.ActionBase;
import model.ChangeDeliveryModel;


public class ChangeDeliveryAction extends ActionBase {

	ChangeDeliveryModel trackingAction100;
	loginPageAction loginPage;

	public ChangeDeliveryAction(WebDriver driver) {
		super(driver);
		trackingAction100 = new ChangeDeliveryModel(driver);
		loginPage = new loginPageAction(driver);
	}

	// All actions on Tracking_changeDelivari page
	public void navigateToPage() throws Exception {
		
		trackingAction100.Tracking().click();
		Thread.sleep(1000);
		trackingAction100.ChangeDelevary().click();
		Thread.sleep(1000);
		driver.findElement(By.className("close_btn_thick")).click();

	}

	public boolean actionEmailLink() throws Exception {
		Thread.sleep(2000);
		boolean linktest = trackingAction100.EmailLink().isEnabled();
		return linktest;

	}

	public boolean actionCallUsLink() throws Exception {
		boolean linktest1 = trackingAction100.CallUs().isEnabled();
		return linktest1;

	}

	public boolean actionSelectAllCnt() throws Exception {
		boolean linktest2 = trackingAction100.SelectAllCnt().isEnabled();
		return linktest2;
	}

	public boolean actionHelpSupport() throws Exception {
		boolean linktest3 = trackingAction100.HelpSupport().isEnabled();
		return linktest3;
	}

	public boolean actionGetStartedUps() {
		boolean linktest4 = trackingAction100.HelpSupport().isEnabled();
		return linktest4;

	}

	public boolean actionClaimsDbord() {
		boolean linktest5 = trackingAction100.ClaimsDbord().isEnabled();
		return linktest5;
	}

	public boolean actionAssertEmailLink() throws Exception {
		Thread.sleep(1000);
		trackingAction100.EmailLink().click();
		Thread.sleep(2000);
		driver.findElement(By.id("tcChat_btnCloseChat_img")).click();
		boolean Email = trackingAction100.assertEmailLink().isDisplayed();
		return Email;

	}

	public boolean aactionAssartCallUs() throws Exception {
		Thread.sleep(1000);
		trackingAction100.CallUs().click();
		Thread.sleep(2000);
		boolean call = trackingAction100.assertCallUs().isDisplayed();
		return call;

	}

	public boolean actionAssertSelectAllCnt() throws InterruptedException {

		Thread.sleep(1000);
		trackingAction100.SelectAllCnt().click();
		Thread.sleep(1000);
		boolean All = trackingAction100.assertSelectAllCnt().isDisplayed();
		return All;
	}

	public  boolean AssertClaimsDbord() throws Exception {
		Thread.sleep(1000);
		trackingAction100.ClaimsDbord().click();
		Thread.sleep(4000);
		loginPage.LoginSupport("nahid1243", "kingkong1234@");
		Thread.sleep(4000);
		boolean Claim = trackingAction100.assertClaimsDbord().isDisplayed();
		return Claim;
	}

}
