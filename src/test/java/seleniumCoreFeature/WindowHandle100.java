package seleniumCoreFeature;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
	    driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
	    driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
	    driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();
	    
		
		
		Set<String> window = driver.getWindowHandles();
		Iterator<String> itr = window.iterator();
		while(itr.hasNext()) {
			
			String childWindow = itr.next();
			
				String act =driver.switchTo().window(childWindow).getTitle();
				if(act.equals("Sign Up | LinkedIn")) {
					driver.switchTo().window(childWindow);
					driver.findElement(By.xpath("//input[@id='email-or-phone']")).sendKeys("kavita");
				}
		}
	}
}