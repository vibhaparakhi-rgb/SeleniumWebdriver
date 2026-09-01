package Day32;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//1 Find Total no of rows in table
		List<WebElement> row=driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		System.out.println("Total number of column"+ row.size());
		//OR
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("Total number of column"+ rows);
		
		//2 find total number of column
		int column=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("Total number of column" + column);
		
		//Read data from specific rows and column
		WebElement data=driver.findElement(By.xpath("//table[@name='BookTable']//tr[3]//td[1]"));
		System.out.println(data.getText());
		//4 read data from all rows and column
		System.out.println("BookName"+"\t"+"Author"+"\t"+"Subject"+"\t"+"Price");   // if we want header to print
		for(int r=2;r<=row.size();r++) {
			for(int c=1;c<=column;c++) {
				String alldata = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(alldata+"\t");
				
			}
			System.out.println();
		}
		//5 print book name whose author is mukesh... conditional 
		//first locate author column
		for(int r=2;r<=row.size();r++) {
		String authName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
		if(authName.equals("Mukesh")) {
			String bookName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
			System.out.println(bookName+ "\t" + authName);
		}
			
		}
		//find total price of all book
		int total = 0;
		for(int r=2;r<=row.size();r++) {
			String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
			total = total+ Integer.parseInt(price);
			
				
			}
		System.out.println("Total price of book:" +"\t"+  total);
		driver.quit();

	}

}
