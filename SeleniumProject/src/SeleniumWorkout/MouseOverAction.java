package SeleniumWorkout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\jesus mary\\eclipse-workspace\\lib\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://greenstech.in/selenium-course-content.html");
	
	WebElement mouse = driver.findElement(By.xpath("//a[text()='COURSES']"));
	Actions a = new Actions(driver);
	a.moveToElement(mouse).perform();
	//Oracle Training 
	
	WebElement mouse1 = driver.findElement(By.xpath("//span[text()='Oracle Training ']"));
	Actions b = new Actions(driver);
	b.moveToElement(mouse1).perform();	
	
	driver.quit();
	
	}
	

}
