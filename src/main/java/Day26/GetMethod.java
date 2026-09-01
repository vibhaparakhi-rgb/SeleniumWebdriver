package Day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		
		System.out.println(driver.getTitle());
		//current url
		System.out.println(driver.getCurrentUrl());
		//getPageSource  --not so much imp
		//System.out.println(driver.getPageSource());
		//getWindowHandle
		System.out.println(driver.getWindowHandle());
		//getWindowHandles --if we opened multiple window then multiple window id will show
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		System.out.println(driver.getWindowHandles());
		
		//close()   close one window
		driver.close();
		//quit()  close all tab
		driver.quit();
		


		
	}

}
