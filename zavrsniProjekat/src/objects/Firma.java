package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Firma {

	public static final String URL = "https://humanity214.humanity.com/app/dashboard/";

	public static void DashBoard(WebDriver driver) throws InterruptedException {
		Home.Login(driver);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"sn_dashboard\"]/span")).click();

	}
	/*
	 * public static void removeAnnouncement(WebDriver driver) {
	 * 
	 * WebElement removeAnnounc =
	 * driver.findElement(By.xpath("//*[@id=\"tcp-modal\"]/div/div/div[1]/button"));
	 * removeAnnounc.click(); }
	 */

	public static void ShiftPlaning(WebDriver driver) {

		driver.navigate().to(URL);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"sn_schedule\"]/span")).click();

	}

	public static void TimeClock(WebDriver driver) {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"sn_timeclock\"]/span")).click();

	}

	public static void Leave(WebDriver driver) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"sn_requests\"]/span")).click();
	}

	public static void Training(WebDriver driver) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"sn_training\"]/span")).click();
	}

	public static void Staff(WebDriver driver) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"sn_staff\"]/span")).click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public static void Availability(WebDriver driver) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"sn_availability\"]/span")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

	public static void Payroll(WebDriver driver) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"sn_payroll\"]/span/i")).click();
	}

	public static void Reports(WebDriver driver) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/div[7]/div/div[2]/ul/li[8]/a/span")).click();
	}

	public static void AddEmployees(WebDriver driver) throws InterruptedException {
		// Home.Login(driver);
		driver.navigate()
				.to("https://humanity214.humanity.com/app/schedule/employee/week/overview/overview/4%2c5%2c2021/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"e_empty\"]/button")).click();
		driver.findElement(By.id("fname_2")).click();
		driver.findElement(By.id("fname_2")).sendKeys("Zlatko");
		driver.findElement(By.id("lname_2")).click();
		driver.findElement(By.id("lname_2")).sendKeys("Zlatic");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"positions_2-selectized\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"positions_2-selectized\"]")).sendKeys("Staff");
		driver.findElement(By.xpath("//*[@id=\"positions_2-selectized\"]")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("add_employee_btn")).click();
	}

	public static void EmployeChangeName(WebDriver driver, String name) throws InterruptedException {

		driver.navigate().to("https://humanity214.humanity.com/app/staff/edit/6370795/");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		driver.findElement(By.partialLinkText("Edit Deta")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("first_name")).click();
		driver.findElement(By.id("first_name")).clear();

		driver.findElement(By.id("first_name")).sendKeys(name);

	}

	public static void AddNewEmployers(WebDriver driver) {

	}

}
