import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class elementEnabledOrDisabled {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vikas Tripathi\\Desktop\\chromedriver.exe\\");
				WebDriver driver= new ChromeDriver();
				driver.get("https://www.spicejet.com/");
				driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();	
				driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
			
				// to check if element is enabled or disabled.
				System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
				driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
				System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
				
				if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
{
	System.out.println("its enabled");
	Assert.assertTrue(true);
}
				else
				{
					Assert.assertTrue(false);
				}

	}

}
