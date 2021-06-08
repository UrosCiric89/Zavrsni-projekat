package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.Settings;

public class TestSetings {

	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Urke i Boka\\Desktop\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test(priority = 1)
	public void testChangeLanguage() throws InterruptedException {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		Settings.GoToSettings(driver);
		Thread.sleep(2000);
		driver.findElement(By.name("language")).click();
		driver.findElement(By.xpath("//*[@id=\"adminSettingsForm\"]/div[1]/table/tbody/tr[3]/td[2]/select/option[37]"))
				.click();

		driver.findElement(By.id("_fbody")).click();

		Thread.sleep(5000);

	}

	@Test(priority = 2)
	public void DisableNotification() throws InterruptedException {

		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"pref_pref_email\"]")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"pref_pref_sms\"]")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"pref_pref_mobile_push\"]")).click();

	}

}
