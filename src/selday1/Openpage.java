package selday1;

import org.openqa.selenium.edge.EdgeDriver;

public class Openpage {
	
	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		
		driver.close();
				
	}
}
