package objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PodesavanjeProfila {
	
	public static final String URL = "https://humanity214.humanity.com/app/dashboard/";
	public static final String TXTSTR_XPATH ="//*[@id=\"wrap_us_menu\"]/i";
	public static final String TXTPROFILE_XPATH ="//*[@id=\"userm\"]/div/a[1]";
	public static final String TXTEDIT_XPATH ="//*[@id=\"_cd_staff\"]/div[2]/div[2]/div[1]/a[2]";
	public static final String TXTNICKNAME_XPATH ="//*[@id=\"nick_name\"]";
	public static final String TXTCITY_XPATH ="//*[@id=\"city\"]";
	public static final String TXTSAVE_XPATH ="//*[@id=\"NewEmployeeForm\"]/table/tbody/tr[42]/td/input";
	
	public static void Profile(WebDriver driver) throws InterruptedException {
		Home.Login(driver);
		driver.findElement(By.xpath(TXTSTR_XPATH)).click();
		driver.findElement(By.xpath(TXTPROFILE_XPATH)).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath(TXTEDIT_XPATH)).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath(TXTNICKNAME_XPATH)).click();
		driver.findElement(By.xpath(TXTNICKNAME_XPATH)).sendKeys("Cira");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath(TXTCITY_XPATH)).click();
		driver.findElement(By.xpath(TXTCITY_XPATH)).sendKeys("Belgrade");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath(TXTSAVE_XPATH)).click();
		
		

	}


}
