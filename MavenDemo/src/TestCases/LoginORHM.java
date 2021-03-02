package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginORHM {
  @Test
  public void login() throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");

		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "C://Users//User-pc//Desktop//Selenium/Logfile.txt");
		
      WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.className("button")).click();
		
		Thread.sleep(3000); //wait for home page to load
		
		//Logout
		driver.findElement(By.partialLinkText("Welcome")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);	
		
		driver.close();
		
		System.out.println("Test case 1 completed");

  }
}
