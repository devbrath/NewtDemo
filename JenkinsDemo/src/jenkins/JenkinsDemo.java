package jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class JenkinsDemo {
	
	
	@Test
	public void runJenkins(){
		
		
		System.out.println("Hello beginners in Jenkins");
		
		WebDriver driver= new FirefoxDriver();
		driver.navigate().to("http://www.google.com");
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		
	}
	

}
