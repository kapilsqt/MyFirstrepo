package selday5;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Testapp {
	
	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f, new File("C:\\Users\\CROMA CAMPUS\\Desktop\\SS\\image.png"));
		
	}

}

/*
 * Dimension dimension = new Dimension(400, 700);
 * driver.manage().window().setSize(dimension);
 */

//Point point = new Point(500, 300);
//driver.manage().window().setPosition(point);

//JavascriptExecutor executor = (JavascriptExecutor)driver;
//executor.executeScript("window.scrollBy(0 , 1000)");