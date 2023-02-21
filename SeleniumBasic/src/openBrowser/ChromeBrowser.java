package openBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Workspace\\SeleniumBasic\\Executables\\chromedriver.exe");
		ChromeDriver cd= new ChromeDriver();
		cd.get("https://www.google.com");

	}

}
