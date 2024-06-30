package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateElements {
	
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();// 123
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

	By forgetpwd = By.linkText("Forgotten Password");
	By loginbtn = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
	
	doClick(forgetpwd);
	driver.navigate().back();
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	driver.navigate().refresh();
	doClick(loginbtn);
	

	
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	//by locator ---> webelement
		public static WebElement getElement(By locator) {
			return driver.findElement(locator);
		}

	
	
}
