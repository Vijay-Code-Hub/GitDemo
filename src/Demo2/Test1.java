package Demo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://mail.google.com/mail/u/1/?ogbl#inbox");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		

	}

}
