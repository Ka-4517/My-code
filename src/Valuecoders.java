import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Valuecoders {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
	 ChromeOptions options = new ChromeOptions();
	 WebDriver driver = new ChromeDriver(options);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://app.workstatus.io/auth/login");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys("karan.gupta@mail.vinove.com");
	driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys("Karan123@");
    options.addArguments("disable-infobars");
    options.addArguments("--disable-extensions");
//   new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[starts-with(@name, 'a-') and starts with(@src, 'https://www.google.com/recaptcha')]")));
//   new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.recaptcha-checkbox-checkmark"))).click();
    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
    wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@title='reCAPTCHA']")));
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='recaptcha-checkbox-border']")));
    driver.findElement(By.id("recaptcha-anchor")).click();
    Thread.sleep(2000);
    System.out.println("Captcha passed sucessfully");
    Thread.sleep(2000);
    driver.switchTo().parentFrame();
    driver.switchTo().defaultContent();
    System.out.println(driver.findElement(By.xpath("//button[@aria-label='LOG IN']")));
    driver.findElement(By.xpath("//button[@aria-label='LOG IN']")).click();
    

}
}
