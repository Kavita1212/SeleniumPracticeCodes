package seleniumCoreFeature;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		driver.switchTo().frame("a077aa5e"); //switch to frame by id
		
		driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click(); //on frame ,operation performed
		
		//driver.switchTo().defaultContent(); switch to the parent frame 
	}
}