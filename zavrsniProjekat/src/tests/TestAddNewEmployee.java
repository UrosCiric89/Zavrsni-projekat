package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import objects.Home;

public class TestAddNewEmployee {

	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Urke i Boka\\Desktop\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void testTestAddNewEmployee() throws InterruptedException {
		File f = new File("Zaposleni.xlsx");
		try {

			InputStream in = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(in);
			Sheet sheet = wb.getSheetAt(0);

			SoftAssert sa = new SoftAssert();
			Home.Login(driver);
			Thread.sleep(2000);
			for (int i = 0; i < 4; i++) {
				Row row = sheet.getRow(i);
				Cell c0 = row.getCell(0);
				Cell c1 = row.getCell(1);
				Cell c2 = row.getCell(2);

				String radnikIme = c0.toString();
				String radnikPrezime = c1.toString();
				String radnikPozicija = c2.toString();

				driver.navigate().to(
						"https://kompanija214.humanity.com/app/schedule/employee/week/overview/overview/4%2c5%2c2021/");

				Thread.sleep(2000);

				driver.findElement(By.xpath("//*[@id=\"e_empty\"]/button")).click();
				driver.findElement(By.id("fname_2")).click();
				driver.findElement(By.id("fname_2")).sendKeys(radnikIme);
				driver.findElement(By.id("lname_2")).click();
				driver.findElement(By.id("lname_2")).sendKeys(radnikPrezime);
				Thread.sleep(5000);
				driver.findElement(By.xpath("//*[@id=\"positions_2-selectized\"]")).click();

				driver.findElement(By.xpath("//*[@id=\"positions_2-selectized\"]")).sendKeys(radnikPozicija);
				driver.findElement(By.xpath("//*[@id=\"positions_2-selectized\"]")).sendKeys(Keys.ENTER);
				driver.findElement(By.id("add_employee_btn")).click();
				Thread.sleep(5000);

			}

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
