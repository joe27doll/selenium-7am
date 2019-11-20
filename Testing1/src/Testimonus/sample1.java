package Testimonus;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javafx.beans.property.SetProperty;

public class sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver","C:\\Users\\jesus mary\\eclipse-workspace\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement textEmail = driver.findElement((By.xpath("//input[@ name=Email]")));textEmail.sendKeys("greentext");
		
	}

}
