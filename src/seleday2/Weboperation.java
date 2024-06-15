package seleday2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Weboperation {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();		
		driver.get("https://www.google.com/");		
		driver.manage().window().maximize();		
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
	}

}
