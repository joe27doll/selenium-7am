package SeleniumWorkout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        // declaration and instantiation of objects/variables//
		
    	System.setProperty("webdriver.gecko.driver","C:\\Users\\jesus mary\\eclipse-workspace\\lib\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		

	}

}
