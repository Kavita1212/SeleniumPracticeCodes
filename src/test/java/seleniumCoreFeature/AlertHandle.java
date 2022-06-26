package seleniumCoreFeature;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@type='text' and @name='cusid']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@type='submit' and @name='submit']")).click();
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept(); //ok
		//alert.dismiss(); //cancel
		
		
	}

}
