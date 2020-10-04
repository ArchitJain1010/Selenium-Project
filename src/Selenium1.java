


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {
 
public static void main(String args[]) {
	
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.selenium.dev/downloads/");

	driver.findElement(By.linkText("Blog")).click();
	System.out.println(driver.getTitle());



driver.close();
}
}