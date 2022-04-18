package test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class tracking_TrackandHistoryTest extends TestBase {

	WebDriver driver;

	@Test(priority = '1',groups = {"Smoke"}) // landing page
	public void getCountrys() throws Exception {
		TrTest().getTracking001();
		TrTest().actionTrackHistoey();
		TrTest().actionReferenceNo();
		Thread.sleep(2000);
		TrTest().actionCountrys();
		TrTest().actionCountrys02();
		

	}

	@Test(priority = '1')
	public void getFreight01() throws Exception {
		TrTest().getTracking001();
		TrTest().actionTrackHistoey();
		TrTest().actionReferenceNo();
		Thread.sleep(2000);
		Assert.assertEquals(true, TrTest().FreightSelected());
		Assert.assertEquals(true, TrTest().actionMail());

	}

}
