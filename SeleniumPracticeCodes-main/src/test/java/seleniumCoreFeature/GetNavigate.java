package seleniumCoreFeature;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;



public class GetNavigate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.wikipedia.org/");
		/*
		 * driver.navigate().to("https://www.wikipedia.org/"); Thread.sleep(3000);
		 * WebElement e = driver.findElement(By.cssSelector("a[href*='donate']"));
		 * e.click();
		 */
		/*
		 * //Get String url = "https://www.tutorialspoint.com/index.htm";
		 * driver.get(url); driver.manage().timeouts().implicitlyWait(12,
		 * TimeUnit.SECONDS); //driver.close();
		 */	
		 String url = "https://www.tutorialspoint.com/index.htm";
	      // new browser will launch and navigate to the URL
	      driver.navigate().to(url);
	      driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	      // refresh the current browser
	      driver.navigate().refresh();
	      //Using id tagname attribute combination for css expression
	      driver.findElement(By.xpath("//input[@type='search']")). sendKeys("Selenium");
	      //browser will go back to the previous page
	      driver.navigate().back();
	      //browser will go move to the next page
	      driver.navigate().forward();
	      //driver.close();
		}
	
}