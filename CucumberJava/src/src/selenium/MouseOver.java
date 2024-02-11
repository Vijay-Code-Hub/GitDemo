package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/Driver/chromedriver_win32/chromedriver-win64/chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.setBinary("D:/Driver/chromedriver_win32/chrome-win64/chrome.exe");
		 WebDriver driver = new ChromeDriver(option);
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.amazon.in/events/greatindianfestival");
		 
		 Actions a = new Actions(driver);
		 a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		 
		 //type in caps in Text
		 //To select text use doubleClick
		 a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("helo").doubleClick().build().perform();
		 
		 //To right click use contextClick
		 a.moveToElement(driver.findElement(By.cssSelector(".nav-imageHref"))).contextClick().build().perform();
		 

	}

}
