package Day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClassDemoGuru {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\andre\\eclipse-workspace\\SeleniumWorks\\Driver\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo99.com/test/drag/_html");

	}

}
