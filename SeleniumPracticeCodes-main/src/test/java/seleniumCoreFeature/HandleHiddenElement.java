package seleniumCoreFeature;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;



public class HandleHiddenElement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		 driver.get("https://courses.letskodeit.com/practice");
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      // identify element and click
	      driver.findElement(By.id("hide-textbox")).click();
	      // Javascript executor class with executeScript method
	      JavascriptExecutor j = (JavascriptExecutor) driver;
	      // identify element and set value
	      j.executeScript ("document.getElementById('displayed-text').value='Selenium';");
	      String s = (String) j.executeScript("return document.getElementById('displayed-text').value");
	      System.out.print("Value entered in hidden field: " +s);
	     // driver.close();
	}
}