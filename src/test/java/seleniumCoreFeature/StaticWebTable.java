package seleniumCoreFeature;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		String text = driver.findElement(By.xpath("//table[@id='customers']//tr[2]/td[2]")).getText();
		System.out.println(text);
		driver.close();

	}

}
