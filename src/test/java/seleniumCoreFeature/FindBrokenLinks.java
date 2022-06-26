package seleniumCoreFeature;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindBrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		String url ="";
		HttpURLConnection huc = null;
		int responseCode=200;

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//List<WebElement> links  = driver.findElements(By.tagName("a"));
		List<WebElement> links  = driver.findElements(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td//ul/li/a"));
		
		Iterator<WebElement> itr = links.iterator();
		while(itr.hasNext()) {
			url = itr.next().getAttribute("href");
			System.out.println(url);
			
			huc = (HttpURLConnection)(new URL(url).openConnection());
			huc.setRequestMethod("HEAD");
			huc.connect();
			responseCode = huc.getResponseCode();
			if(responseCode>=400) {
				System.out.println(url + "==broken link");
			}
			else {
				System.out.println(url + "Valid link");
			}
		}
		driver.quit();
	}
}