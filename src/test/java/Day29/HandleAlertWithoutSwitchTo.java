package Day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlertWithoutSwitchTo {

	//By USing Explicit wait
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));  //declaration of explicit wait
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		//1Normal alert with ok Button
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Alert myalert =  mywait.until(ExpectedConditions.alertIsPresent());
		System.out.println(myalert.getText());
		myalert.accept();

	}

}
