package Day21;

import org.openqa.selenium.chrome.ChromeDriver;

public class firstProgram {
	//open browser
			//launch URL https://demo.opencart.com
			//validate title should be "Your store"
			//close the browser

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1)Open browser
		ChromeDriver driver = new ChromeDriver();
		//WebDriver driver = new ChromeDriver();
		//2)//launch URL https://demo.opencart.com
		driver.get("https://demo.opencart.com/");
		String act_title= driver.getTitle();
		if(act_title.equals("OpenCart - Demo")) {
			System.out.println("test is passed");
		}else {
			System.out.println("test is failed");
			
		}
		//4)close the browser
		driver.close();
		//driver.quit();
		

	}

}
