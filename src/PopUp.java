import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp {

	public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Karan Gupta\\\\Desktop\\\\eclipse\\\\chromedriver.exe");
			//Instantiate the webdriver
			WebDriver driver = new ChromeDriver();
			
			//Set the username
			String username = "admin";
			
			//Set the password
			String password = "admin";
			
			
			String URL = "https://" +username +":" +password +"@"+ "the-internet.herokuapp.com/basic_auth";
			driver.get(URL);
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			String title = driver.getTitle();
			
			System.out.println("The page title is "+title);
			
			String text = driver.findElement(By.tagName("p")).getText();
			
			System.out.println("The test present in page is ==> "+text);
			
//			driver.close();
//			driver.quit();
		
	}

}
