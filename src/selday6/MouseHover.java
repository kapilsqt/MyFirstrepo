package selday6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		By xpath = By.xpath("/html/body/div[1]/div/div[2]/nav/div[2]/ul[1]/li[1]/a");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.onlinesbi.sbi/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement we = driver.findElement(xpath);
		Actions actions = new Actions(driver);		
		actions.moveToElement(we);
		actions.click().build().perform();
		
		
	}

}
