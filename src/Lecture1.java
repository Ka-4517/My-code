import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lecture1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Karan Gupta\\\\OneDrive\\\\Desktop\\\\eclipse\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*
		 * here Webdriver is a interface and have Capability to access methods related
		 * to Chrome and other classes also
		 */
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();

	}

}
