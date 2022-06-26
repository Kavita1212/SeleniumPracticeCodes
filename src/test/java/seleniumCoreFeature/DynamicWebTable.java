package seleniumCoreFeature;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		List<WebElement> col = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/thead/tr/th"));
		System.out.println(col.size());
		
		List<WebElement> row = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
		System.out.println(row.size()); 

	}

}
