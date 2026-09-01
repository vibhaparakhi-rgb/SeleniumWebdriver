package Day31;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		//Open drop down
		driver.findElement(By.xpath("  ")).click();
		//select 1 option
		driver.findElement(By.xpath(" ")).click();
		//Capture all options and find size
		List<WebElement> options= driver.findElements(By.xpath(" "));
		System.out.println("Number of options:" + options.size());
		//printing options from dropdown  using enhanced for lop
		for(WebElement op:options) {
			System.out.println(op.getText());
		}
		//select multiple options
		for(WebElement op:options) {
			if(op.getText().equals("Java")||op.getText().equals("Python")||op.getText().equals("MySQL")) {
				op.click();
			}
			
		}
		
		

	}

}
