package Demo2;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


public class MosueOver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/Driver/chromedriver_win32/chromedriver-win64/chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.setBinary("D:/Driver/chromedriver_win32/chrome-win64/chrome.exe");
		 WebDriver driver = new ChromeDriver(option);
		 
		 
		driver.get("https://www.amazon.in/events/greatindianfestival");
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		
		//Type in caps in search box
		a.moveToElement(driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"))).click().keyDown(Keys.SHIFT).sendKeys("Vijay").build().perform();

	}

}
