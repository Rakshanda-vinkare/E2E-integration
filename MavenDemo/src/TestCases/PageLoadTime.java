package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class PageLoadTime {
  @Test
  public void Pageload() throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "C://Users//User-pc//Desktop//Selenium/Logfile.txt");
		
		WebDriver driver = new FirefoxDriver();
		
		long start = System.currentTimeMillis();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		//login to orhm
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin"); //relative xpath
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@class='button' and @name='Submit']")).click();
		Thread.sleep(2000);
		
		

		long finish = System.currentTimeMillis();
		long totalTime = finish - start; 
		System.out.println("Total Time for page load - "+totalTime);
		
		//Logout
		driver.findElement(By.partialLinkText("Welcome")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);	
		
		driver.close();
		System.out.println("Test case 2 completed!!");
  }
}
