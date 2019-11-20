package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class interexplore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
					
				        // declaration and instantiation of objects/variables
				    	System.setProperty("webdriver.edge.driver","C:\\Users\\jesus mary\\eclipse-workspace\\lib\\MicrosoftWebDriver.exe");
						WebDriver driver = new EdgeDriver();
						
						//comment the above 2 lines and uncomment below 2 lines to use Chrome
						//System.setProperty("webdriver.chrome.driver","C:\\Users\\jesus mary\\eclipse-workspace\\lib\\chromedriver.exe");
						//WebDriver driver = new ChromeDriver();
				    	
				        String baseUrl = "http://www.green technologys/test/newtours/";
				        String expectedTitle = "Welcome: Mercury Tours";
				        String actualTitle = "";

				        // launch Fire fox and direct it to the Base URL
				        driver.get(baseUrl);

				        // get the actual value of the title
				        actualTitle = driver.getTitle();

				        /*
				         * compare the actual title of the page with the expected one and print
				         * the result as "Passed" or "Failed"
				         */
				        if (actualTitle.contentEquals(expectedTitle)){
				            System.out.println("Test Passed!");
				        } else {
				            System.out.println("Test Failed");
				        }
				       
				        //close Fire fox
				        driver.close();
				       
				    }



	}


