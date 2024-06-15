package selday4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Webforms {
	
	public static void main(String[] args) {
		By xpath = By.xpath("/html/body/main/div/form/div/div[2]/label[3]/input");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Select sel = new Select(driver.findElement(By.xpath("//select[@class='form-select']")));
		sel.selectByIndex(2);
		
		driver.findElement(xpath).sendKeys("C:\\Users\\CROMA CAMPUS\\Desktop\\Programming with Python Training Curriculum.docx");
		driver.findElement(By.name("my-check")).click();
	
	}

}
