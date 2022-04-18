package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.ModelBase;

public class trackingPageModel extends ModelBase {

	public trackingPageModel(WebDriver driver) {
		super(driver);

	}

	WebElement Tracking = null;
	WebElement TrackHistoey = null;
	WebElement referenceNo = null;
	WebElement Countrys = null;
	WebElement Freight = null;
	WebElement Mail = null;

	WebElement FreightSelected = null;

	public WebElement Tracking01() {
		Tracking = driver.findElement(By.id("ups-menuLinks0"));
		return Tracking;
	}

	public WebElement TrackHistoey() {
		TrackHistoey = driver.findElement(By.xpath("//a[contains(text(),'Track & Track History')]"));
		return TrackHistoey;
	}

	public WebElement referenceNo() {
		referenceNo = driver.findElement(By.xpath("//button[@id='stApp_btn_refTrack']"));
		return referenceNo;
	}

	public WebElement Countrys() {
		Countrys = driver.findElement(By.xpath("//select[@id='trkDestCountry']"));
		return Countrys;
	}

	public WebElement Freight() {
		Freight = driver.findElement(By.xpath("//label[contains(text(),'Freight')]"));
		return Freight;
	}

	public WebElement FreightSelected() {
		Freight = driver.findElement(By.xpath("//input[@id='trkShipmentTypeFreight']"));
		return Freight;
	}

	public WebElement Mail() {
		Mail = driver.findElement(By.xpath("//label[contains(text(),'Mail Innovations')]"));
		return Mail;
	}

	public WebElement MailSelected() {
		Mail = driver.findElement(By.xpath("//input[@id='trkShipmentTypeMailInnovations']"));
		return Mail;
	}

}
