package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		String para = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/p[2]")).getText();
//		
//		System.out.println(para);
//		
//		String forgettenlinktext = driver.findElement(By.linkText("Forgotten Password")).getText();
//		System.out.println(forgettenlinktext);
//		
//		String newcust = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/p[1]")).getText();
//		System.out.println(newcust);
//		
//		String header = driver.findElement(By.tagName("h2")).getText();
//		System.out.println(header);

		By forgetpwd = By.linkText("Forgotten Password");
		By para = By.xpath("//*[@id=\"content\"]/div/div[1]/div/p[2]");
		By newcust = By.xpath("//*[@id=\"content\"]/div/div[1]/div/p[1]");
		By header = By.tagName("h2");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		String h = eleUtil.doGetText(para);
		System.out.println(h);
		
		System.out.println(eleUtil.doGetText(header));
		
		
		
		
	}

}
