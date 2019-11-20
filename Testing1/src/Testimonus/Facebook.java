package Testimonus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\jesus mary\\eclipse-workspace\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String Title =driver.getTitle();
		System.out.println("Title is  + Title");
		String currenturl =driver.getCurrentUrl();
		System.out.println("currentUrl");
		driver.quit();
		
	}

}
