package SeleniumWorkout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\jesus mary\\eclipse-workspace\\lib\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		WebElement bhu =driver.findElement(By.id("credit2"));
		WebElement Bhu1=driver.findElement(By.id("bank"));
		Actions joe=new Actions(driver);
		joe.dragAndDrop(bhu, Bhu1).perform();
		//driver.quit();
			
		
	} 

}
