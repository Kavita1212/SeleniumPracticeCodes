package seleniumCoreFeature;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotHandle {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
				
		driver.get("https://www.google.co.in/");
		
		TakesScreenshot sc = (TakesScreenshot) driver;
		File fs = sc.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fs, new File("C:\\Users\\user\\git\\SeleniumCodes\\SeleniumCode\\google.png"));
	}
}