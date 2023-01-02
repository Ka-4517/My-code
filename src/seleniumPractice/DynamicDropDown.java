package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karan Gupta\\OneDrive\\Desktop\\eclipse\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@value=\"IXG\"]")).click();
		System.out.print("from " + driver.findElement(By.xpath("//a[@value=\"IXG\"]")).getText());
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@value=\"DEL\"])[2]")).click();
		System.out.println(" To " + driver.findElement(By.xpath("(//a[@value=\"DEL\"])[2]")).getText());
		Thread.sleep(1000);

	}

}
