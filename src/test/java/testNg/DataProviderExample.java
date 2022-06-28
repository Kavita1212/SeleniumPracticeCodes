package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderExample {
	@Test(dataProvider="dp")
	public void dataProvide(String email,String password) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.close();

	}
	@DataProvider
	public Object[][] dp(){
		  Object[][] data = new Object[2][2];
		  data[0][0]="kav";
		  data[0][1]="kav123";
		  data[1][0]="tan";
		  data[1][1]="tan123";
		return data;
	}

}
