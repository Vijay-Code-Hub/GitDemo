package selenium;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class useCss {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		driver.get("https://rahulshettyacademy.com/");
		//Explicit wait
		//use Duration.ofSecond(5), because of selenium 4
		WebDriverWait w= new WebDriverWait(driver,Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.theme-btn")));
		driver.findElement(By.cssSelector("a.theme-btn")).click();//uses css selctor
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		
		driver.close();

	}

}
