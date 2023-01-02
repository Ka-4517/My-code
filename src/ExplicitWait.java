import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Karan Gupta\\\\OneDrive\\\\Desktop\\\\eclipse\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(1));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		// implicit wait is applied globally and it is available foe all the elements //
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();

		//// a[text()='Create New Account']
		driver.findElement(By.name("firstname")).sendKeys("Karan");
		driver.findElement(By.name("lastname")).sendKeys("Gupta");
		driver.findElement(By.name("reg_email__")).sendKeys("guptak4517@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("karan4517@");

		Select date = new Select(driver.findElement(By.xpath("id('day')")));
		date.selectByVisibleText("24");
		Select month = new Select(driver.findElement(By.xpath("id('month')")));
		month.selectByVisibleText("Dec");
		Select year = new Select(driver.findElement(By.xpath("id('year')")));
		year.selectByVisibleText("1989");
		System.out.println(date.getFirstSelectedOption().getText() + " : is selected from the static dropdown.");
		System.out.println(month.getFirstSelectedOption().getText() + " : is selected from the static dropdown.");
		System.out.println(year.getFirstSelectedOption().getText() + " : is selected from the static dropdown.");
		driver.findElement(By.cssSelector("input[value=\"1\"]")).click();
		driver.findElement(By.cssSelector("input[value=\"2\"]")).click();
		driver.findElement(By.cssSelector("input[value=\"-1\"]")).click();
		driver.findElement(By.xpath("//button[@name=\"websubmit\"]")).click();
//		Select pronoun = new Select(driver.findElement(By.xpath("id('day')")));
//        date.selectByVisibleText("She: \"Wish her a happy birthday!\"");

	}

}
