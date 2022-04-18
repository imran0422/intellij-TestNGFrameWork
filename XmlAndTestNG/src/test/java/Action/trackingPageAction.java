package Action;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.ActionBase;
import model.trackingPageModel;

public class trackingPageAction extends ActionBase {
	trackingPageModel trackingAction;

	public trackingPageAction(WebDriver driver) {
		super(driver);
		trackingAction = new trackingPageModel(driver);
	}

	public void getTracking001() {
		trackingAction.Tracking01().click();

	}

	public void actionTrackHistoey() throws Exception {
		Thread.sleep(1000);
		trackingAction.TrackHistoey().click();
	}

	public void actionReferenceNo() throws Exception {
		Thread.sleep(1000);
		trackingAction.referenceNo().click();
	}

	public void actionCountrys() throws Exception {
		trackingAction.Countrys().click();
		Thread.sleep(2000);
		trackingAction.Countrys().click();

		Select hh = new Select(trackingAction.Countrys());
		List<WebElement> cList = hh.getOptions();
		Iterator<WebElement> kk=cList.iterator();
		while(kk.hasNext()) {
			System.out.println(kk.next().getText());	
		}

//		for (int i = 0; i < cList.size(); i++) {
//			System.out.println(cList.get(i).getText());
//		}
		System.out.println("===============================================================");

	}

	public void actionCountrys02() throws Exception {
		Thread.sleep(1000);
		trackingAction.Countrys();
		Select hh = new Select(trackingAction.Countrys());
		List<WebElement> cList = hh.getOptions();
//		cList.size();
//		for (int i = 0; i < cList.size(); i++) {
//			String ll = cList.get(i).getText();
//			if (ll.equals("Bangladesh")) {
//				System.out.println(ll);
//				break;
//			}
		Iterator<WebElement> ww = cList.iterator();
		while(ww.hasNext()) {
			String bd = ww.next().getText();
			if(bd.equals("Bangladesh")) {
				System.out.println(bd);
			}
		}
		
		}
	

	public void actionFreight01() throws Exception {
		
	}

	public boolean FreightSelected() {
		trackingAction.Freight().click();
		boolean sel = trackingAction.FreightSelected().isSelected();
		return sel;

	}

	public boolean actionMail() {
		trackingAction.Mail().click();
		boolean M1 = trackingAction.MailSelected().isSelected();
		return M1;
	}

}
