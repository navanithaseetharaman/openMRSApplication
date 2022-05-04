package wrapper;

import org.openqa.selenium.WebElement;

public interface WwrapperInterface {
	
	public void openBrowser(String url);
	
	public WebElement locateElement(String locator, String locatorVal);

	public void elementTypeByID(WebElement element, String value);

	public void elementClickByID(WebElement element, String value);
	
	public void elementTypeByXpath(WebElement element, String value);

	public void elementClickByXpath(WebElement element, String value);
	
	public void elementselectByValue(WebElement element, String value);

	

}
