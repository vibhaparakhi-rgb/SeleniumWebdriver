package Day29;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		System.out.println("Test is passed");
		//1Normal alert with ok Button
		/*driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Alert myalert = driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.accept();
		WebElement result = driver.findElement(By.xpath("//p[@id='result']"));
		if(result.getText().equals("You successfully clicked an alert")){
		System.out.println("Test is passed");
		}else {
			System.out.println("Test is failed");
		}*/
		
		//2 confirmation alert OK or Cancel
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Alert myalert = driver.switchTo().alert();
		myalert.accept();
		WebElement result = driver.findElement(By.xpath("//p[@id='result']"));
		if(result.getText().equals("You clicked: Ok")){
		System.out.println("Test is passed");
		}else {
			System.out.println("Test is failed");
			
		
		
		}
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		driver.switchTo().alert().dismiss();
		WebElement resultcancel = driver.findElement(By.xpath("//p[@id='result']"));
		if(resultcancel.getText().equals("You clicked: Cancel")){
		System.out.println("Test is passed");
		}else {
			System.out.println("Test is failed");
			
		
		
		}
		//Prompt alert - input box
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Alert mypromptAlert = driver.switchTo().alert();
		mypromptAlert.sendKeys("Welcome");
		mypromptAlert.accept();
		WebElement resultprompt = driver.findElement(By.xpath("//p[@id='result']"));
		if(resultprompt.getText().equals("You entered: Welcome")){
		System.out.println("Test is passed");
		}else {
			System.out.println("Test is failed");
			
		
		
		}
		
		
		
		driver.quit();
	}

}
