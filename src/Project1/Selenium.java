package Project1;

import java.awt.AWTException;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Selenium {
WebDriver driver;
@BeforeTest
public void open()  {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		
	}
@Test
	public void data() throws InterruptedException, AWTException {
		driver.findElement(By.id("firstName")).sendKeys("Archit");
		driver.findElement(By.id("lastName")).sendKeys("Jain");
		driver.findElement(By.id("userEmail")).sendKeys("architjain@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]//div[2]//div[1]//label")).click();
		driver.findElement(By.id("userNumber")).sendKeys("9084409458");
		WebElement WE1 = driver.findElement(By.id("dateOfBirthInput"));
		WE1.sendKeys(Keys.CONTROL,"a");
		WE1.sendKeys("10 Oct 1995");
		  WebElement button = driver.findElement(By.xpath("//div[contains(@class,'subjects-auto-complete__value')]"));
		  JavascriptExecutor js = (JavascriptExecutor)driver;	
		  button.click();
	       js.executeScript("window.scrollBy(0,500)");

	        WebElement checkBox= driver.findElement(By.xpath("//*[@id='hobbies-checkbox-3']"));
			
			js.executeScript("arguments[0].click();", checkBox);
			driver.findElement(By.id("currentAddress")).sendKeys("B Block Sector 50 Noida ");
		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("closeLargeModal")).click();
	}
	
	@AfterTest
	public void close() {
		driver.close();
	}
	}


