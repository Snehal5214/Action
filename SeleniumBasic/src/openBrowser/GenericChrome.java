package openBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "E:\\Workspace\\SeleniumBasic\\Executables\\chromedriver.exe");
		WebDriver cd = new ChromeDriver();
		cd.get("https://www.google.com");
		cd.close();

	}

}
