package seleniumCoreFeature;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_1");
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//button[@type='button' and @class='multiselect dropdown-toggle btn btn-default']")).click();

		List<WebElement> lst = driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']/li"));
		for (int i = 0; i < lst.size(); i++) {
			String text = lst.get(i).getText();
			if(text.contains("Angular")) {
				lst.get(i).click();
				break;
			}
		}
		//driver.close();
	}
}