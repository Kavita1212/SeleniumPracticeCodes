package seleniumCoreFeature;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-zso239'])[2]"));
		String s = driver.findElement(By.xpath("(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar'])[2]")).getAttribute("style");
		System.out.println(s);
	}
}