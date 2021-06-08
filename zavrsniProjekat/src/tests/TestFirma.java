package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import objects.Firma;
import objects.Home;

public class TestFirma {

	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Urke i Boka\\Desktop\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test(priority = 1)
	public void testDashBoard() throws InterruptedException {
		Firma.DashBoard(driver);
		// driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		String CurrnetUrl = driver.getCurrentUrl();
		String expectedUrl = "https://humanity214.humanity.com/app/dashboard/";

		Assert.assertEquals(CurrnetUrl, expectedUrl);
	}

	@Test(priority = 2)
	public void ShiftPlanning() {
		// driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		Firma.ShiftPlaning(driver);

		String CurrnetTitle = driver.getTitle();
		String expectedTitle = "ShiftPlanning - Humanity";

		Assert.assertEquals(CurrnetTitle, expectedTitle);
	}

	@Test(priority = 3)

	public void TImeClock() {
		// driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		Firma.TimeClock(driver);
		String CurrnetUrl = driver.getCurrentUrl();
		String expectedUrl = "https://humanity214.humanity.com/app/timeclock/";

		Assert.assertEquals(CurrnetUrl, expectedUrl);
	}

	@Test(priority = 4)
	public void testLeave() {

		Firma.Leave(driver);
		String CurrnetUrl = driver.getCurrentUrl();
		String expectedUrl = "https://humanity214.humanity.com/app/requests/vacation/";
		Assert.assertEquals(CurrnetUrl, expectedUrl);
	}

	@Test(priority = 5)
	public void testTraining() {

		Firma.Training(driver);
		String CurrnetUrl = driver.getCurrentUrl();
		String expectedUrl = "https://humanity214.humanity.com/app/training/";

		Assert.assertEquals(CurrnetUrl, expectedUrl);
	}

	@Test(priority = 6)
	public void testStaff() {

		Firma.Staff(driver);
		String CurrnetUrl = driver.getCurrentUrl();
		String expectedUrl = "https://humanity214.humanity.com/app/staff/list/load/true/";

		Assert.assertEquals(CurrnetUrl, expectedUrl);
	}

	@Test(priority = 11)
	public void testAvailability() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		Firma.Availability(driver);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		String CurrnetUrl = driver.getCurrentUrl();
		
		String expectedUrl = "https://humanity214.humanity.com/fe/availability/#/requests/week/2021-06-06/1";

		Assert.assertEquals(CurrnetUrl, expectedUrl);
	}

	@Test(priority = 10)
	public void testEmployeNameChange() throws InterruptedException {

		Firma.EmployeChangeName(driver, "Misko");
		driver.findElement(By.name("update")).click();

	}

	@Test(priority = 7)
	public void testPayroll() {

		Firma.Payroll(driver);
		String CurrnetUrl = driver.getCurrentUrl();
		String expectedUrl = "https://humanity214.humanity.com/app/payroll/scheduled-hours/";

		Assert.assertEquals(CurrnetUrl, expectedUrl);
	}

	@Test(priority = 8)
	public void testReports() {

		Firma.Reports(driver);
		String CurrnetUrl = driver.getCurrentUrl();
		String expectedUrl = "https://humanity214.humanity.com/app/payroll/scheduled-hours/";

		Assert.assertEquals(CurrnetUrl, expectedUrl);
	}

	@Test(priority = 9)
	public void testAddEmploye() throws InterruptedException {

		Firma.AddEmployees(driver);
		Thread.sleep(5000);
		driver.navigate().to("https://humanity214.humanity.com/app/staff/detail/6359484/");
		String currenUrl = driver.getCurrentUrl();
		String expectedUrl = "https://humanity214.humanity.com/app/staff/detail/6359484/";

		Assert.assertTrue(driver.getPageSource().contains("Zlatko"));
	}

}
