package seleniumCoreFeature;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HandleSSLCertificate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		@SuppressWarnings("deprecation")
		WebDriver driver = new ChromeDriver(cap);
		driver.manage().window().maximize();
		
	}
}