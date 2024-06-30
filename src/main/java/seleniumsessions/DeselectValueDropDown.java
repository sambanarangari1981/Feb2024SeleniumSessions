package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectValueDropDown {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://html.com/attributes/select-multiple/");
		//multiple attribute should be there with the select tag
		
		Select select = new Select(driver.findElement(By.xpath("//*[@id=\"post-291\"]/div/div[2]/select")));
		System.out.println(select.isMultiple());
		
		if(select.isMultiple()) {
			
			select.selectByVisibleText("American flamingo");
			select.selectByVisibleText("Chilean flamingo");
			select.selectByVisibleText("Lesser flamingo");

		}
		
		Thread.sleep(3000);
		//select.deselectAll();
		
		select.deselectByVisibleText("Chilean flamingo");
		

	}

}
