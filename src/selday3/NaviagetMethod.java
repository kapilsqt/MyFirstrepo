package selday3;

import org.openqa.selenium.chrome.ChromeDriver;

public class NaviagetMethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();		
		driver.navigate().to("https://www.google.com/");		
		driver.manage().window().maximize();		
		Thread.sleep(3000);		
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();		
		driver.navigate().refresh();
	}
}
