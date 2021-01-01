import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vikas Tripathi\\Desktop\\chromedriver.exe\\");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");	
		/*driver.find
		 Select object= new Select();
		   */
		
		WebElement dropDown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select sd= new Select(dropDown);
		sd.selectByIndex(3);
		System.out.println(sd.getFirstSelectedOption().getText());
		sd.selectByVisibleText("AED");
		System.out.println(sd.getFirstSelectedOption().getText());
		sd.selectByValue("INR");
		System.out.println(sd.getFirstSelectedOption().getText());
		driver.close();
	}
}
