import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {

	public static void main(String[] args) {
		//Firefox
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\vijay\\Documents\\Driver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		//Microsoft Edge
		System.setProperty("webdriver.edge.driver", "C:\\Users\\vijay\\Documents\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
