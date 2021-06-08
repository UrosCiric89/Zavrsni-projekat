package tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.AboutUsAndLogin;

public class TestAboutUsAndLogin {

	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Urke i Boka\\Desktop\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test(priority = 1)
	public void AboutUs() {
		driver.navigate().to(AboutUsAndLogin.URL);
		driver.manage().window().maximize();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {

			e1.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"tcp-modal\"]/div/div/div[1]/button")).click();

		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[6]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[6]/ul/li[1]/a/p[1]")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {

			e1.printStackTrace();
		}

		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file,
					new File("C:/Users/Urke i Boka/eclipse-workspace/zavrsniProjekat/screenshot/tets.png"));
		} catch (IOException e) {

			e.printStackTrace();
		}
		driver.navigate().back();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

	@Test(priority = 2)
	public void LoginTest() {

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		AboutUsAndLogin.Login(driver);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		String currnetUrl = driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());

		String expectedUrl = "https://humanity214.humanity.com/app/dashboard/";

		Assert.assertEquals(currnetUrl, expectedUrl);

	}

}
