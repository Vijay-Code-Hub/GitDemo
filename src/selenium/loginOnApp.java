package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class loginOnApp {

	public static void main(String[] args) throws InterruptedException {
		// launch the browser 
		
		System.setProperty("webdriver.chrome.driver", "D:/Driver/chromedriver_win32/chromedriver-win64/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("D:\\Driver\\chromedriver_win32\\chrome-win64\\chrome.exe");
		
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.get("https://courses.rahulshettyacademy.com/");
		driver.findElement(By.cssSelector("a[class='theme-btn register-btn']")).click();
		driver.findElement(By.name("sign_up_method")).click();
		driver.findElement(By.id("user_name")).sendKeys("Vijay sharma");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("95vijaysharma@gmail.com");
		driver.findElement(By.name("password")).sendKeys("12345vijay");
		driver.findElement(By.xpath("//input[@name='commit']")).click();
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.cssSelector("span[class='text-with-icon']")).getText());
			
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.id("email")).sendKeys("95vijaysharma@gmail.com");
		driver.findElement(By.name("password")).sendKeys("12345vijay");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
