package Testimonus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\jesus mary\\eclipse-workspace\\lib\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://greenstech.in/selenium-course-content.html");
    String title =driver.getTitle();
	System.out.println("title is: " + title);
	String curentUrl = driver.getCurrentUrl();
	System.out.println("currenturl"+curentUrl);
	driver.quit();

	}

}
