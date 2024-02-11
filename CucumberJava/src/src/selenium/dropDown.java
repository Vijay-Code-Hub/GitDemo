package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {

	public static void main(String[] args) throws InterruptedException {
		// drop down
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://trytestingthis.netlify.app/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		WebElement dynamicdd=driver.findElement(By.name("option"));
		
		Select dd=new Select(dynamicdd);
		
		dd.selectByIndex(1);
		System.out.println(dd.getFirstSelectedOption().getText());
		
		Thread.sleep(2000);
		
		dd.selectByValue(("option 2"));
		System.out.println(dd.getFirstSelectedOption().getText());
		
		Thread.sleep(2000);
		
		dd.selectByVisibleText("Option 3");
		System.out.println(dd.getFirstSelectedOption().getText());
		

	}

}
