package Day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBoxex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//1 Select specific checkbox
		//driver.findElement(By.id("sunday")).click();
		
		//2 select all checkboxes
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and type='checkbox']"));
//       for(int i=0;i<checkboxes.size();i++) {
//			checkboxes.get(i).click();
//		}
//		//OR
		for(WebElement checkbox:checkboxes) {
			checkbox.click();
		}
//		//select last 3 checkboxes
//		// total no of checkboxes- how many checkboxes you want to select = starting index
//		// 7-3=4  (Starting index
////		for(int i = 4;i<checkboxes.size();i++) {
////			checkboxes.get(i).click();
////		}
//		//4 select first 3 checkboxes
//		
//		for(int i= 0;i<3;i++) {
//			checkboxes.get(i).click();
//		}
//		//5 unselect checkboxes which are already selected
//		
//		//driver.close();
//		
//		

	}

}

