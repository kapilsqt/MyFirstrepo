package selday3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locate1 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.id("my-text-id")).sendKeys("ABC");
		driver.findElement(By.name("my-password")).sendKeys("ABC123");
		
		driver.findElement(By.linkText("Return to index")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/main/div/form/div/div[2]/button")).click();
		Thread.sleep(3000);
	}

}
