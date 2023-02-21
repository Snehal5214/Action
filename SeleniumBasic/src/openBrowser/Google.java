package openBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" ,"E:\\Workspace\\SeleniumBasic\\Executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String actualTitle= driver.getTitle();
		String expectedTitle ="google";
		System.out.println("Actual Title is: "+actualTitle);
		System.out.println("Expected title is: "+expectedTitle);
		System.out.println(actualTitle.equals(expectedTitle));
		System.out.println(driver.getPageSource().length());
		String actualURL= driver.getCurrentUrl();
		String expectedURL ="https://www.google.com";
		System.out.println("Actual URL is: "+actualURL);
		System.out.println("Expected URL is: "+expectedURL);
		System.out.println(actualURL.contains(expectedURL));
		
		driver.close();

	}

}
