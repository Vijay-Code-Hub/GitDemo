package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchBrowser {

	public static void main(String[] args) {
		// invoking the chrome by using chrome driver
		//selenium manager added new feature  without set property we can run test case 
		//System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		// driver.manage().window().maximize();

		driver.close();
	}

}
