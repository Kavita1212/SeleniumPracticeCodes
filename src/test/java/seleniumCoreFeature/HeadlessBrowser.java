package seleniumCoreFeature;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions option  = new ChromeOptions();
		option.setHeadless(true);
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		System.out.println(driver.getTitle());		
	}
}