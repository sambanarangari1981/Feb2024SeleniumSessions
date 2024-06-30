package seleniumsessions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.WebDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new SafariDriver();
		//WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println("Page title: "+ title);
		
		if (title.equals("Google")) {
			System.out.println("title is correct");
		}
		else {
			System.out.println("title is not correct");
		}
		
		// get the url
		
		String url = driver.getCurrentUrl();
		System.out.println("Page url is: " + url);
		
		if(url.contains("google.com")) {
			
			System.out.println("url is correct");
		}
		else {
			System.out.println("url is not correct");
		}
		
		
		
		
	}
		
}


