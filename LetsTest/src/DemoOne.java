import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vikas Tripathi\\Desktop\\chromedriver.exe\\");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		
		driver.get("https://www.facebook.com");
		driver.navigate().back();
		driver.close();
		

	}

}
