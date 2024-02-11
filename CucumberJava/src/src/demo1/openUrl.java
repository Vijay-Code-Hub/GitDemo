package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openUrl {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.enovate-it.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
