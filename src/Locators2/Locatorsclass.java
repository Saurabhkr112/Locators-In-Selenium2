package Locators2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locatorsclass {
@Test
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\DXC Selenium Class\\Locators In Selenium2\\SeleniumChromeJars5\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.opencart.com/index.php?route=cms/demo");
	driver.findElement(By.id("input-email")).sendKeys("Admin");
	driver.findElement(By.id("input-password")).sendKeys("admin123");
		

	}

}
