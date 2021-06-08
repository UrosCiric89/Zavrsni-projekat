package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.Firma;
import objects.PodesavanjeProfila;

public class TestPodesavanjeProfila {
	
	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Urke i Boka\\Desktop\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void testProfile() throws InterruptedException {
		PodesavanjeProfila.Profile(driver);
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		String CurrnetUrl = driver.getCurrentUrl();
		String expectedUrl = "https://humanity214.humanity.com/app/staff/edit/6357568/";

		Assert.assertEquals(CurrnetUrl, expectedUrl);
	}

}
