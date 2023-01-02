import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class openLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Karan Gupta\\\\OneDrive\\\\Desktop\\\\eclipse\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("gf-BIG"));
		String clickonnewtab = Keys.chord(Keys.CONTROL, Keys.ENTER);
		driver.findElement(By.xpath("//div/table/tbody/tr/td[1]/ul/li[2]")).sendKeys(clickonnewtab);

	}

}
