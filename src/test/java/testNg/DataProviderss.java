package testNg;

import org.openqa.selenium.By;
import com.excel.utility.TestUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderss {
	WebDriver driver;

	@Test(dataProvider = "dp")
	public void dataProvider(String email, String password) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.close();

	}

	@DataProvider
	public Object[][] dp() {
		//Object[][] data=TestUtil.getTestData("Login");
		Object[][] data=TestUtil.getTestData("Sheet1");
		  return data;
	}

}
