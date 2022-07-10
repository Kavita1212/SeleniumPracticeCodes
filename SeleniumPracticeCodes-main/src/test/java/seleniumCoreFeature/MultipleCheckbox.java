package seleniumCoreFeature;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;



public class MultipleCheckbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//tagnam[contains(@attributename,"") and not(contains(@attributename,""))]
		
		List<WebElement> wb = driver.findElements(By.xpath("//input[@type='checkbox']"));
		//List<WebElement> wb = driver.findElements(By.xpath("//div[@id='checkbox-example']/fieldset/label/input"));
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, 20);
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		 */
	
		
		for (int i = 0; i < wb.size(); i++) {
			String name = wb.get(i).getAttribute("name");
			System.out.println(name);
			
			//System.out.println(wb.get(i).getText());
			Thread.sleep(2000);
			if(name.equals("checkBoxOption1") || name.equals("checkBoxOption3")) {
				wb.get(i).click();
				System.out.println(wb.get(i).isSelected());
			}
		}
	}
}