package objects;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {
	
public static final String URL ="https://www.humanity.com/";
public static final String TXTLOGIN_XPATH ="//*[@id=\"navbarSupportedContent\"]/div/a[2]/p";

	public static void Login (WebDriver driver) {
		driver.navigate().to(URL);
		//Ako se zakomentarise linija 21 radi testHome
		driver.findElement(By.xpath("//*[@id=\"tcp-modal\"]/div/div/div[1]/button")).click();
		driver.manage().window().maximize();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		driver.findElement(By.xpath(TXTLOGIN_XPATH)).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("email")).sendKeys("urosuros@gmail.com");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("uros123");
		driver.findElement(By.name("login")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
	}

	
	
	

	
	
		
	
}
