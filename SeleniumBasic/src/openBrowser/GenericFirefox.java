package openBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericFirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver" , "E:\\Workspace\\SeleniumBasic\\Executables\\geckodriver.exe");
		WebDriver fx = new FirefoxDriver();
		fx.get("https://www.google.com");
		fx.close();

	}

}
