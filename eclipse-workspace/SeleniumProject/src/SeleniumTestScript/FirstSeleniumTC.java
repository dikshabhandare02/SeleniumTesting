package SeleniumTestScript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTC {
	static {
		System.setProperty("webdriver.chromedriver","./driver/chromedriver");
	}
	public static void main (String args[])  {
		
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.amazon.in/");
    driver.quit();
}
}