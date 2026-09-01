package Day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.nopcommerce.com/");
		String Act_Title= driver.getTitle();
		if(Act_Title.equals("nopCommerce demo store")) {
			System.out.println("Test is passed");
		}else {
			System.out.println("Test is failed");
		}
		driver.close();

	}

}
