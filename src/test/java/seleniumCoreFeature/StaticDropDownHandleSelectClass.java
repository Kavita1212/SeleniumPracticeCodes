package seleniumCoreFeature;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticDropDownHandleSelectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		WebElement country = driver.findElement(By.name("country"));
		Select select = new Select(country); //for options
		
		List<WebElement> lst = select.getOptions();
		
		for (int i = 0; i < lst.size(); i++) {
			//System.out.println(lst.get(i).getText());
			String s = lst.get(i).getText();
			if(s.contains("ARMENIA")) {
				lst.get(i).click();
				break;
			}
		}
		
	}

}
