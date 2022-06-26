package seleniumCoreFeature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

@SuppressWarnings("unused")
public class VerifyDropDownSortedOptions {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
				
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.id("animals"));
		
		Select se = new Select(element);
				
		ArrayList originalList = new ArrayList();
		ArrayList tempList = new ArrayList();
		
		for (WebElement e : se.getOptions()) {
			originalList.add(e.getText());
			tempList.add(e.getText());
		}

		System.out.println("this is originalList before Sorting"+ originalList);
		System.out.println("this is tempList before Sorting"+ tempList);
		
		Collections.sort(tempList);
		
		System.out.println("this is originalList after Sorting"+ originalList);
		System.out.println("this is tempList after Sorting"+ tempList);
				
		if(originalList==tempList)
		{
			System.out.println("Dropdown sorted");
		}
		else
		{
			System.out.println("Dropdown Not sorted");
			
		}
		driver.close();
	}

}

