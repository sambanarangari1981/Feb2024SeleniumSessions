package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SessionIdQuitClose {

	public static void main(String[] args) {
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
		
		//driver.close(); // session id will be invalid
		driver.quit(); // session id  will be  null 
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
	
		
	}

	}


