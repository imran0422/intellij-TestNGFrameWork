package test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class tracking_ChangeDeliveryTest extends TestBase {

	WebDriver driver;

	@Test(groups = { "Smoke" })
	public void allLinksTest() throws Exception {

		links().navigateToPage();
		Assert.assertEquals(true, links().actionEmailLink());
		Assert.assertEquals(true, links().actionSelectAllCnt());
		Assert.assertEquals(true, links().actionHelpSupport());
		Assert.assertEquals(true, links().actionGetStartedUps());
		Assert.assertEquals(true, links().actionCallUsLink());
		Assert.assertEquals(true, links().actionClaimsDbord());
	}

	@Test(priority = '1')
	public void assertEmailLinkPage() throws Exception {
		links().navigateToPage();
		Assert.assertEquals(true, links().actionAssertEmailLink());
	}

	@Test(priority = '2')
	public void assertCallUs() throws Exception {
		links().navigateToPage();
		Assert.assertEquals(true, links().aactionAssartCallUs());
	}

	@Test(priority = '3')
	public void assertSelectAllCnt() throws Exception {
		links().navigateToPage();
		Assert.assertEquals(true, links().actionAssertSelectAllCnt());
	}

	@Test(priority = '4')
	public void assertClaimsDbord() throws Exception {
		links().navigateToPage();
		Assert.assertEquals(true, links().AssertClaimsDbord());
	}

}
