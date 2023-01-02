import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleScroll {
	@Test
	public void scrollDown(){
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Karan Gupta\\\\OneDrive\\\\Desktop\\\\eclipse\\\\chromedriver.exe");
	          WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.navigate().to("https://the-internet.herokuapp.com/infinite_scroll");
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(800,50000000)");
	}
}
