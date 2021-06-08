package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Settings {

	public static final String SETTING_XPATH = "//*[@id=\"sn_admin\"]/span/i";
	public static final String SETTING_ID = "sn_admin";

	public static void GoToSettings(WebDriver driver) throws InterruptedException {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		Home.Login(driver);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		Thread.sleep(5000);
		driver.findElement(By.xpath(SETTING_XPATH)).click();
	}
}
