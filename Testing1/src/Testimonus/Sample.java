package Testimonus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jesus mary\\eclipse-workspace\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://greenstech.in/selenium-course-content.html");
		WebElement title = driver.findElement(By.id("box-wrapper")).findElement(By.tagName("img"));
		System.out.println(title.getAttribute("title"));
		
		
		WebElement content = driver.findElement(By.id("box-wrapper")).findElement(By.tagName("span"));
		System.out.println(content.getText());
		
	}
}
