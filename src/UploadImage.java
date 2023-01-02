
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

//public class WndsFileUpl
public class UploadImage {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karan Gupta\\Desktop\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// launch application
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");

		// identify element
		WebElement m = driver.findElement(By.xpath("//input[@type='file']"));

		// windows file upload with file path
		m.sendKeys("C:\\\\Users\\\\Karan Gupta\\\\Pictures\\\\karan.jpg");

		// browser close

	}
}
