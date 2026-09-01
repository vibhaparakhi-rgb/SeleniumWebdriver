package Day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		WebElement logo= driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		//isDisplayed()  we can check display status of element
		System.out.println("Logo is displayed"+ logo.isDisplayed());
		//isEnabled()  we can check element is enabled or not  input box,checkbox,radio button
		WebElement input = driver.findElement(By.xpath(""));
		input.isEnabled();
		//isSelected()  to check element is selected or not  checkbox,radio button,dropdown
		WebElement selection = driver.findElement(By.xpath(""));
		System.out.println(selection.isSelected());   //before selection  false 	

	}

}
