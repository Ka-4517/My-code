import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Karan Gupta\\\\OneDrive\\\\Desktop\\\\eclipse\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://istqb.in/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.xpath("//div[@class=\"uk-visible-large uk-navbar-flip\"]/ul/li[3]"));
		a.moveToElement(move).build().perform();
		driver.findElement(By.xpath("(//li)[37]")).click();
		//CONTANS()TEXT() TYPE  //*[contains(text(),'ABC')]

	}

}
