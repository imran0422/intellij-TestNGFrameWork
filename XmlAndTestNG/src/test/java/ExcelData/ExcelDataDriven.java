package ExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExcelDataDriven {
	WebDriver driver;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFCell cell;

	@BeforeMethod
	public void openBrowser() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void excelReader() throws Exception {
		File src = new File("C:\\Users\\nahid\\Documents\\TestNGTesy.xlsx");
		FileInputStream fis = new FileInputStream(src);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(0);

		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			cell = sheet.getRow(i).getCell(0);
			cell.setCellType(Cell.CELL_TYPE_STRING);
			driver.findElement(By.xpath("//input[@id='email']")).clear();
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(cell.getStringCellValue());

			cell = sheet.getRow(i).getCell(1);
			cell.setCellType(Cell.CELL_TYPE_STRING);
			driver.findElement(By.xpath("//input[@id='pass']")).clear();
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(cell.getStringCellValue());
		}
		
	}
	@AfterMethod
	public void closebrw() {
		driver.quit();
	}

}
