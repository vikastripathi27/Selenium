import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class e2eSpicejet {

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
		
		driver.findElement(By.cssSelector("#divpaxinfo")).click();
		Thread.sleep(2000);
		WebElement adult= driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_Adult"));
		
		Select ps=new Select(adult);
		ps.selectByValue("5");
		
		driver.findElement(By.cssSelector("#divpaxinfo")).click();
		
WebElement money=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select sd= new Select(money);
		sd.selectByIndex(3);
		
		driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
		

	}

}
