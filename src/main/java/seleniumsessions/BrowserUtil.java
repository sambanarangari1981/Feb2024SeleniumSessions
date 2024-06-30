package seleniumsessions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {
	
	WebDriver driver;
	
	public WebDriver launchBrowser(String browserName) {
		System.out.println("The Broswer Name:" +browserName);
		
		switch(browserName.trim().toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("Plz pass the right browser..." +browserName);
			throw new BrowserException("Invalid Browser...." +browserName);
			
		}
		return driver;
	}
	
	public void launchURL(String url) {
		if (url==null) {
			throw new BrowserException("Invalid URL...." +url);
		}
		if (url.isBlank() || url.isEmpty()) {
			throw new BrowserException("BLANK/Empty URL...." +url);
		}
		//https://www.google.com
		if ((url.indexOf("http")==-1) || url.indexOf("http") > 0) {
			throw new BrowserException("HTTP(s) is missing...." +url);
		}
		
		driver.get(url.trim());	
	}
	
	public String getPageTitle() {
		String title = driver.getTitle();
		if(title == null) {
			System.out.println("Getting the null title....");
			return null;
		}
		return title;
	}
	
	public String getPageCurrentURL() {
		return driver.getCurrentUrl();
	}
	
	public void quitBrowser() {
		driver.quit();
	}
	
	public void closeBrowser() {
		driver.close();
	}
	

}
