package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {

	WebDriver driver;

	public void openBrowser(String appUrl, String stepDescription) {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(appUrl);
		driver.manage().window().maximize();

	}

	public void closeBrowser(String stepDescription) {

		driver.quit();

	}

	public void writeText(String text, By element) {

		driver.findElement(element).sendKeys(text);

	}

	public void submit(By element) {

		driver.findElement(element).submit();

	}

	public void click(By element) {

		driver.findElement(element).click();
	}

	public void sleep() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException ie) {
		}
	}
	
	public void validateText(String expectedtext, By element) {
		
		String texto = driver.findElement(element).getText();
		assertEquals(expectedtext, texto);
						
	}
	
}
