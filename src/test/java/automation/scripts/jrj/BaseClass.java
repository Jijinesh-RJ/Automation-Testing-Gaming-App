package automation.scripts.jrj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {
	public static WebDriver driver;

	public WebDriver launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\New Test\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		return driver;
	}

	public void launchUrl(WebDriver driver, String url) {
		driver.get(url);
		driver.manage().window().maximize();

	}

	public void typeText(WebElement element, String data) {
		element.sendKeys(data);

	}

	public void btnClick(WebElement element) {
		element.click();

	}

	public void mouseHover(WebDriver driver, WebElement element) {
		Actions mo = new Actions(driver);
		mo.moveToElement(element).perform();

	}

	public void handleTab(WebDriver driver, By tabLocator) {
		try {
			// Check if the tab appears
			WebElement tab = driver.findElement(tabLocator);

			// If the tab is found, close it (assuming clicking the tab closes it)
			tab.click();
			System.out.println("Tab found and closed.");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			// If the tab is not found, log a message
			System.out.println("Tab not found. Continuing with regular procedures.");
		}
	}

	public String srchPlayer(WebElement element) {
		String text = element.getText();
		return text;
	}
}
