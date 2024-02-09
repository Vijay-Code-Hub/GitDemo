package selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class useXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			WebDriver driver= new ChromeDriver();
			
			//implicit wait 
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
			
			driver.get("https://rahulshettyacademy.com/");
			driver.findElement(By.xpath("//span[@class='icon fa fa-user']")).click();
			
			
			//explicit wait
			
			
			
			WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(5));
			w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[value='email']")));
			driver.findElement(By.cssSelector("button[value='email']")).click();
			driver.findElement(By.cssSelector("input#user_name")).sendKeys("vijaySharma");
			driver.findElement(By.cssSelector("input#user_email")).sendKeys("95vijaysharma@gmail.com");
			driver.findElement(By.cssSelector("input#password")).sendKeys("9990877037");
			driver.findElement(By.xpath("//input[@value='Sign up']")).click();
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			driver.close();
	}

}
