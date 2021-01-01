import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vikas Tripathi\\Desktop\\chromedriver.exe\\");
		WebDriver driver= new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Forgot Your Password?")).click();
		
		driver.findElement(By.id("un")).sendKeys("vikastripathi");
		
		driver.findElement(By.name("continue")).click();

	}

}
