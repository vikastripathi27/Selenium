import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vikas Tripathi\\Desktop\\chromedriver.exe\\");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000);
		
		for(int i=0;i<4;i++)
		{
		driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
		}
		
			
		driver.findElement(By.cssSelector("#btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000);
		
		int j=1;
		while(j<4)
		{
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
			j++;
		}
		
		driver.findElement(By.cssSelector("#btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());

	}

}
