package facebookloginpassword;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jesus mary\\eclipse-workspace\\lib\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://facebook.com/");
		WebElement textEmail = driver.findElement(By.id("email")); 
		textEmail.sendKeys("fernando_tnj@yahoo.co.in");
		WebElement Textpassword = driver.findElement(By.name("pass")); 
		Textpassword.sendKeys("Fathima27");
		WebElement ClikLogin = driver.findElement(By.id("u_0_b"));
		ClikLogin.click();
	
		
		
		
		

	}

}
