package Demo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Invoking {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:/Driver/chromedriver_win32/chromedriver-win64/chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.setBinary("D:/Driver/chromedriver_win32/chrome-win64/chrome.exe");
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.naukri.com/mnjuser/recommendedjobs");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.close();
	}

}
