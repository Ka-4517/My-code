import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {
	
	public static void main(String[] args)throws IOException {
		  //To set system property           
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Karan Gupta\\\\Desktop\\\\eclipse\\\\chromedriver.exe");
		  //Open the driver
		        WebDriver driver = new ChromeDriver();
		        String MyURL="https://"+"dummyURL.com";
		        //String URL = "https://" +dummyusername +":" +dummypassword +"@"+ "dummyurl.com";
		//	driver.get(URL);
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			String currenturl = driver.getCurrentUrl();
		        if(currenturl==MyURL){
		            System.out.println("Hurray You are successfully done login");
		            }
		        else
		            System.out.println("login Unsuccessfull");
				
			System.out.println("The page URL is "+currenturl);
		        driver.close();
			driver.quit();
		}

}
