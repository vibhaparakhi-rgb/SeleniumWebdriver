package Day31;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement selectEle = driver.findElement(By.xpath("//select[@id='country']"));
		Select dropcntry = new Select(selectEle);
		//select option from dropdown by visible text
		dropcntry.selectByVisibleText("India");
		System.out.println("Test is passed");
		//select option from dropdown by value
		dropcntry.selectByValue("usa");
		System.out.println("Test is passed");
		//select option from dropdown by Index ..we have to count manually
		dropcntry.selectByIndex(3);
		System.out.println("Test is passed");
		//Capture options from dropdown list
		List<WebElement> options = dropcntry.getOptions();
		System.out.println("Total number of option" + options.size());
		//Print all options
//		for(int i=0;i<options.size();i++) {
//			System.out.println(options.get(i).getText());
//		}
		//Enhanced for loop
		for(WebElement op:options) {
			System.out.println(op.getText());
		}

	}

}
