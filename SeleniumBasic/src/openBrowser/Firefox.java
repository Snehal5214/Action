package openBrowser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver" , "E:\\Workspace\\SeleniumBasic\\Executables\\geckodriver.exe");
		FirefoxDriver fx= new FirefoxDriver();
		fx.get("https://www.google.com");

	}

}
