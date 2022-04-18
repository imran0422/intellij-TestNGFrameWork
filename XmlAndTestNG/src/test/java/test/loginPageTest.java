package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.TestBase;

public class loginPageTest extends TestBase {
	WebDriver driver;

	@Test (groups = {"Smoke"})
	public void loginTest() throws Exception  {
		getActions().getLogin("nahid1243", "kingkong1234@");
	}

}
