package wrapper;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WrapperClass implements WwrapperInterface {
	public RemoteWebDriver driver;

	public void openBrowser(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

	}

	public WebElement locateElement(String locator, String locatorVal) {
		switch (locator) {
		case "id":
			return driver.findElement(By.id(locatorVal));
		case "class":
			return driver.findElement(By.className(locatorVal));
		case "linkText":
			return driver.findElement(By.linkText(locatorVal));
		case "partialLinkText":
			return driver.findElement(By.partialLinkText(locatorVal));
		case "xpath":
			return driver.findElement(By.xpath(locatorVal));
		case "css":
			return driver.findElement(By.cssSelector(locatorVal));
		}
		return null;

	}

	public void elementTypeByID(WebElement element, String value) {
		element.sendKeys(value);

	}

	public void elementClickByID(WebElement element, String value) {
		element.click();

	}

	public void elementTypeByXpath(WebElement element, String value) {
		element.sendKeys(value);

	}

	public void elementClickByXpath(WebElement element, String value) {
		element.click();

	}

	@Override
	public void elementselectByValue(WebElement element, String value) {
		// TODO Auto-generated method stub
		
	}


}
