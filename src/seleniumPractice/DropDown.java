package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karan Gupta\\OneDrive\\Desktop\\eclipse\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/dropdown");
		WebElement staticDropdown = driver.findElement(By.id("dropdown"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByVisibleText("Option 2");
		System.out.println(dropdown.getFirstSelectedOption().getText() + " : is selected from the static dropdown.");

	}
	

}
