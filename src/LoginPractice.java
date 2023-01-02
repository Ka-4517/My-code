import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Karan Gupta\\\\OneDrive\\\\Desktop\\\\eclipse\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector("a[target=\"_blank\"]")).click();
		Thread.sleep(1000);
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
	    Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.cssSelector("input[value=\"user\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("okayBtn")).click();
		driver.findElement(By.cssSelector("option[value=\"consult\"]")).click();
		driver.findElement(By.cssSelector("input[type=\"checkbox\"]")).click();
		driver.findElement(By.id("signInBtn")).click();
		/*split concept*/
		String userId= driver.findElement(By.cssSelector(".text-center.text-white")).getText().split("is")[1].trim().split(" ")[0];
		System.out.println(userId);
		System.out.println(driver.findElement(By.cssSelector(".text-center.text-white")).getText());
		/*parent to child concept*/
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/a [3]")).click();
		driver.findElement(By.cssSelector("form div:nth-child(4) input")).click();
		
		
		
		

	}

}
