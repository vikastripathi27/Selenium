import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDynamicdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vikas Tripathi\\Desktop\\chromedriver.exe\\");
			WebDriver driver= new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
			
driver.close();
	}

}
