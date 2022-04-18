package Action;


import org.openqa.selenium.WebDriver;

import base.ActionBase;
import model.loginPageModel;

public class loginPageAction extends ActionBase {
	loginPageModel loginmodel;

	public loginPageAction(WebDriver driver) {
		super(driver);
		loginmodel = new loginPageModel(driver);
	}

	public void getLogin(String id, String pwd) throws Exception {
		Thread.sleep(1000);
		loginmodel.loginButton().click();
		Thread.sleep(1000);
		loginmodel.cookis().click();
		loginmodel.uid().sendKeys(id);
		loginmodel.password().sendKeys(pwd);
		loginmodel.submitButton().click();
	}
	public void LoginSupport(String id, String pwd) throws Exception {
		Thread.sleep(1000);
		
		loginmodel.uid().sendKeys(id);
		loginmodel.password().sendKeys(pwd);
		loginmodel.submitButton().click();
	}

}
