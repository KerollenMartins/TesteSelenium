package driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverSetupObject {

	public WebDriver driver;
	public WebDriverWait wait;

	public WebDriver setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kerollen\\Desktop\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		wait = new WebDriverWait(driver, 20);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver;
	}

}