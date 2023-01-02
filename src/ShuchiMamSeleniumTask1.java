import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShuchiMamSeleniumTask1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Karan Gupta\\\\OneDrive\\\\Desktop\\\\eclipse\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://tutorialsninja.com/demo/index.php?route=common/home");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		/* Adding to cart */
		List<WebElement> products = driver.findElements(By.cssSelector(".row"));
		for (int i = 0; i < products.size(); i++) {
			driver.findElements(By.cssSelector("button[onclick=\"cart.add('43');\"]")).get(i).click();
			/* updating more */
			driver.findElements(By.cssSelector("button[onclick=\"cart.add('43');\"]")).get(i).click();
			driver.findElements(By.cssSelector("button[onclick=\"cart.add('43');\"]")).get(i).click();
			Thread.sleep(2000);
			driver.findElements(By.cssSelector("button[onclick=\"cart.add('42');\"]")).get(i).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[value=\"7\"]")).click();
			driver.findElement(By.cssSelector("input[value=\"10\"]")).click();
			WebElement staticDropdown = driver.findElement(By.id("input-option217"));
			Select dropdown = new Select(staticDropdown);
			dropdown.selectByIndex(2);
			driver.findElement(By.id("input-option209")).sendKeys("Karan Gupta");
			WebElement chooseFile = driver.findElement(By.cssSelector("button[id=\"button-upload222\"]"));
			Thread.sleep(1000);
			chooseFile.sendKeys("C:\\\\Users\\\\Karan Gupta\\\\Pictures\\\\karan.jpg");
			Thread.sleep(2000);
			/* Alert */
			// driver.switchTo().alert().accept();
			driver.findElement(By.id("input-quantity")).clear();
			driver.findElement(By.id("input-quantity")).sendKeys("1");
			driver.findElement(By.id("button-cart")).click();
			Thread.sleep(1000);

			break;

		}
		/* Verifying that same product is available or not */
		driver.findElement(By.cssSelector("a[title=\"Shopping Cart\"]")).click();
		Thread.sleep(1000);
		/* and click on update */
		driver.findElement(By.cssSelector("button[data-original-title=\"Update\"]")).click();
		Thread.sleep(1000);
		String ActualTitle = driver.findElement(By.xpath("//div/form/div/table/tbody/tr/td[2]/a")).getText();
		System.out.println(driver.findElement(By.xpath("//div/form/div/table/tbody/tr/td[2]/a")).getText());
		String ExpectedTitle = "MacBook";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		/* checkout */
		driver.findElement(By.cssSelector("a[class=\"btn btn-primary\"]")).click();

	}

}
