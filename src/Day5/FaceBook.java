package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\andre\\eclipse-workspace\\LaunchingProject\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement txtCreateAcc = driver.findElement(By.xpath("//a[text()='Create New Account']"));
	txtCreateAcc.click();
	Thread.sleep(3000);
	WebElement txtFirstName = driver.findElement(By.xpath("//input[@name='firstname']"));
	txtFirstName.sendKeys("Vimal");
	String string = txtFirstName.getAttribute("value");
	System.out.println(string);

}

}
