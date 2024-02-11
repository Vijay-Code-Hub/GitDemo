package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class moreLocaters {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://trytestingthis.netlify.app/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5));
		//driver.findElement(By.cssSelector("input[autocomplete='off']")).sendKeys("java Tutorials");
		
		WebElement dyanmicdd= driver.findElement(By.id("option"));
		
		Select dd= new Select(dyanmicdd);
		//select by ID
		dd.selectByIndex(1);
		System.out.println(dd.getFirstSelectedOption().getText());
		//select by value
		Thread.sleep(2000);
		dd.selectByValue("option 2");
		System.out.println(dd.getFirstSelectedOption().getText());
		//select by text
		Thread.sleep(2000);
		dd.selectByVisibleText("Option 3");
		System.out.println(dd.getFirstSelectedOption().getText());
		
		

	}

}
