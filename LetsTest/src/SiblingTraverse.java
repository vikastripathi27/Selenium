import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SiblingTraverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vikas Tripathi\\Desktop\\chromedriver.exe\\");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/index.php");
		driver.findElement(By.xpath("//*[text()='Practice']")).click();
		

	}

}
