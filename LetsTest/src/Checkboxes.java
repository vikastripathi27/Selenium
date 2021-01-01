import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vikas Tripathi\\Desktop\\chromedriver.exe\\");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_friendsandfamily")).isSelected());
		driver.findElement(By.cssSelector("#ctl00_mainContent_chk_friendsandfamily")).click();
		System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_friendsandfamily")).isSelected());
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
driver.close();
		//driver.findElement(By.cssSelector("#ctl00_mainContent_chk_Unmr")).click();
	}

}
