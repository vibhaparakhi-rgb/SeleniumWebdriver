package Day28;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		WebDriver driver  = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");   //accept URL only in string format
		driver.get("https://demo.nopcommerce.com/register");
		//instead of get we can use navigate().to(URL)
		//diff between navigate and get.. navigate.to also call get method
		//driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");  //accept url in string and URL object foemat also
		// OR
//		URL myUrl = new URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.navigate().to(myUrl);
		
		System.out.println("test passed");
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().refresh();
		
		driver.quit();
		
		
		

	}

}
