package NobelPage;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://nobelpagedev.iworklab.com/");
			System.out.println(driver.findElement(By.tagName("a")).getText());
		    /*windows switch here*/
		    Set <String> windows=driver.getWindowHandles();
		    Iterator<String> it=windows.iterator();
		    String parentid=it.next();
		    String childid=it.next();
		    driver.switchTo().window(childid);
		    System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		    driver.switchTo().window(parentid);
		    /**/

	}

}
