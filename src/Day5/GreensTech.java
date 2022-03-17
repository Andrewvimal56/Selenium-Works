package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTech {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\andre\\eclipse-workspace\\LaunchingProject\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(" http://greenstech.in/selenium-course-content.html");
		WebElement btn = driver.findElement(By.xpath("//span[@title='Overview']"));
		btn.click();
		Thread.sleep(3000);
		WebElement txtParah = driver.findElement(By.xpath("(//p[contains(text(),'Greens Technologies')])[1]"));
		String text = txtParah.getText();
		System.out.println(text);

	}
}