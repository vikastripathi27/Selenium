import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vikas Tripathi\\Desktop\\chromedriver.exe\\");
		WebDriver driver= new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=eu");
		
		driver.findElement(By.cssSelector("#username")).sendKeys("vikas123");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("1234568");
		driver.findElement(By.cssSelector("#Login")).click();
		driver.close();

	}

}
