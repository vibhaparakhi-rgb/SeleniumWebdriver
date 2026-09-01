package Day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpliciteWaitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stu//explicit wait dont use everytime.. when it takes time 
		WebDriver driver = new ChromeDriver();
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));  //declaration  if more time takes
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		WebElement txtuser= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));   //it will wait till that xpath (element) visible
         txtuser.sendKeys("Admin");
         WebElement loginbtn = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
         loginbtn.click();
	}

}
