package Connections;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class WebpageTest{
 WebDriver driver;

    @BeforeTest
    public void openingBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\ForSelenium\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void myTest() throws InterruptedException {
        System.out.println("The webpage title is= " +driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Swag Labs");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"item_5_title_link\"]/div")).click();
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='checkout']")).click();
        driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("IK");
        driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Khan");
        driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("66223");
        driver.findElement(By.xpath("//input[@id='continue']")).click();
        driver.findElement(By.xpath("//button[@id='finish']")).click();
    }
    @AfterTest
    public void closeBrowser() {
        driver.close();
    }

}