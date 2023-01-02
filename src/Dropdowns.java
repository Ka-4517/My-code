import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Karan Gupta\\\\OneDrive\\\\Desktop\\\\eclipse\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		int i = 1;
		/* static Dropdown */
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByVisibleText("USD");
		System.out.println(dropdown.getFirstSelectedOption().getText() + " : is selected from the static dropdown.");
		/* Looping Dropdown */
		driver.findElement(By.id("divpaxinfo")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText() + " before loop.");
		while (i < 5) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;

		}
		System.out.println("Total Adult Passenders : " + i);
		driver.findElement(By.id("btnclosepaxoption")).click();

		/* Dynamic Dropdown */
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@value=\"IXG\"]")).click();
		System.out.print("from " + driver.findElement(By.xpath("//a[@value=\"IXG\"]")).getText());
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@value=\"DEL\"])[2]")).click();
		System.out.println(" To " + driver.findElement(By.xpath("(//a[@value=\"DEL\"])[2]")).getText());
		Thread.sleep(1000);
		/* Dynamic Auto-suggestions */
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		List<WebElement> options = driver.findElements(By.cssSelector("li[class=\"ui-menu-item\"] a"));
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;

			}
		}
		/* Assertions */
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println("Assertion Test Passed.");
		/* Print NUM of links* lecture 91 Done... */
		System.out.println("In this page total number of links are : " + driver.findElements(By.tagName("a")).size());
		/* count number of links present in footer */
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement footerdriver = driver.findElement(By.id("gf-BIG")); // Limiting webdriver scope
		System.out.println(
				"In this footer total number of links are : " + footerdriver.findElements(By.tagName("a")).size());
		/* footer sector link count of one column */
		WebElement columnFooterdriver = footerdriver.findElement(By.xpath("//table[@class=\"gf-t\"]/tbody/tr/td[1]"));
		System.out.println("footer first column links " + columnFooterdriver.findElements(By.tagName("a")).size());
		/* open links on seperate tab */
		for (int i1 = 1; i1 < columnFooterdriver.findElements(By.tagName("a")).size(); i1++) {
			String clickontheLink = Keys.chord(Keys.CONTROL, Keys.ENTER);
			columnFooterdriver.findElements(By.tagName("a")).get(i).sendKeys(clickontheLink);
		}
		/* Scroll downing window */

	}

}
