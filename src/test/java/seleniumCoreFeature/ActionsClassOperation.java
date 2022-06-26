package seleniumCoreFeature;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClassOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Actions action = new Actions(driver);
		
		WebElement emailId = driver.findElement(By.id("email"));
		action.moveToElement(emailId).click().sendKeys("kav");
		action.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c"); //control+a+c
		action.keyUp(Keys.CONTROL).build().perform();
		
		WebElement password = driver.findElement(By.id("pass"));
		action.moveToElement(password).click().keyDown(Keys.CONTROL).sendKeys("v"); //control+v
		action.keyUp(Keys.CONTROL).build().perform();
		
		//Close the focused window
		driver.close();

	}
}