package seleniumCoreFeature;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		WebElement button = driver.findElement(By.cssSelector("._2KpZ6l._2doB4z"));
		button.click();
		
		WebElement dealOfDay = driver.findElement(By.cssSelector(("._2cAig-")));
		System.out.println(dealOfDay.getText());
		

	}

}
