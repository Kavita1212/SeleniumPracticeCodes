package seleniumCoreFeature;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("openwindow")).click();
		String parentWindow = driver.getWindowHandle();
		System.out.println(driver.getTitle());
		Set<String> window = driver.getWindowHandles();
		Iterator<String> itr = window.iterator();
		while(itr.hasNext()) {
			
			String childWindow = itr.next();
			if(!parentWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow);
				System.out.println(driver.getTitle());
			}
		}
		driver.switchTo().window(parentWindow);
		
		
	}

}
