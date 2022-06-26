package seleniumCoreFeature;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("gmail");
		
		List<WebElement> lst=driver.findElements(By.xpath("//li[@class='sbct']"));
		for (int i = 0; i < lst.size(); i++) {
			String act = lst.get(i).getText();
			if(act.contains("login")) {
				lst.get(i).click();
				break;
			}
		}
		driver.close();
	}

}