package seleniumCoreFeature;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;



public class WebDriverException {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com/");
		driver.get("https://www.google.com/");
		
		Thread.sleep(3000);
		//driver.quit(); //close the browser
		driver.close(); //close the browser manually
		
		//Thread.sleep(2000);
		/*
		 * WebElement w = driver.findElement(By.name("q"));
		 * 
		 * driver.navigate().refresh(); WebElement w1 =
		 * driver.findElement(By.name("q")); w1.sendKeys("kav");
		 */
	
		
		//Thread.sleep(2000);
	}
}