package SeleniumWorkout;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbuslogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jesus mary\\eclipse-workspace\\lib\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-table/");
		
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		for (int i = 0; i < rows.size(); i++) {
			WebElement r = rows.get(i);
			List<WebElement> cells = r.findElements(By.tagName("td"));
			for (int j = 0; j < cells.size(); j++) {
				WebElement c = cells.get(j);
				String text = c.getText();
				if (text.equals("Mecca")) {
					System.out.println(text);
						
				}
				
			}}
		
		
	}
}
