package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// create a webelement(FE) + perform an action (click, sendKeys, getText, isDisplayed...etc..)
		//1. id: unique attribute
		
	//	driver.findElement(By.id("input-email")).sendKeys("nssreddi13@gmail.com");
	//	driver.findElement(By.id("input-password")).sendKeys("Prayag@12345");
		
		//2.name: can be duplicate
//		driver.findElement(By.name("email")).sendKeys("nssreddi13@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("prayag@12345");
		
		//3.ClassName: can be duplicate
	//	driver.findElement(By.className("form-control")).sendKeys("nssreddi13@gmail.com");
	//	driver.findElement(By.className("form-control")).sendKeys("Prayag@12345");
	
		//4. xpath: its not an attribute. xpath is the address of element in html dom
		
	//	driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("naveen@gmail.com");
	//	driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("test@123");
	//	driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		
		//5. cssSelector: its not an attribute.
		//css: cascaded style sheet
	
	//	driver.findElement(By.cssSelector("#input-email")).sendKeys("naveen@gmail.com");
	//	driver.findElement(By.cssSelector("#input-password")).sendKeys("test@123");
	//	driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input")).click();
		
		//LinkText: only for links. htmltag <a>
		
	//	driver.findElement(By.linkText("Register")).click();
		
		//PartialLinkText
		
		//driver.findElement(By.partialLinkText("Delivery")).click();
		//delivery information
		
		//8. tagName: html tag
		
		String header = driver.findElement(By.tagName("h2")).getText();
		System.out.println("Print header value: " +header);
		
	}

}
