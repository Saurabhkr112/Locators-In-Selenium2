package Locators2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NameExample2 {
	@Test

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\DXC Selenium Class\\Locators In Selenium2\\SeleniumChromeJars5\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.opencart.com/index.php?route=account/login");
		driver.findElement(By.name("email")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");

	}

}
