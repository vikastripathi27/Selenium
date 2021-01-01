import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vikas Tripathi\\Desktop\\chromedriver.exe\\");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
          driver.findElement(By.id("email")).sendKeys("Vikas@gmail.com");
          driver.findElement(By.id("pass")).sendKeys("123456789");
          driver.findElement(By.id("u_0_b")).click();
          Thread.sleep(5000);
         System.out.println(driver.findElement(By.className("_9ay7")).getText());
         driver.close();

	}

}
