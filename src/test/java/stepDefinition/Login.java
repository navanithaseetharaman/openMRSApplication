package stepDefinition;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import wrapper.WrapperClass;

public class Login extends WrapperClass {

	@Given("Open the browser and launch the application")
	public void launchApplucation() {
		openBrowser("https://demo.openmrs.org/openmrs/login.htm");
	}

	/*
	 * @Then("Enter the Username") public void enterUserName() { WebElement uName =
	 * locateElement("id", "username"); uName.sendKeys("Admin");
	 * 
	 * }
	 * 
	 * @And("Enter the Password") public void enterPassword() { WebElement passcode
	 * = locateElement("id", "password"); passcode.sendKeys("Admin123");
	 * 
	 * }
	 */
	
	@Then("Enter Username as {string}")
	public void enterUName(String userName) {
		WebElement uName = locateElement("id", "username");
		uName.sendKeys(userName);

	}

	@And("Enter Password as {string}")
	public void enterPasscode(String password) {
		WebElement passcode = locateElement("id", "password");
		passcode.sendKeys(password);

	}
	
	
	@Then("Enter {string} in username")
	public void enterName(String Username) {
		WebElement uName = locateElement("id", "username");
		uName.sendKeys(Username);

	}

	@And("Enter {string} in password")
	public void enterCode(String Password) {
		WebElement passcode = locateElement("id", "password");
		passcode.sendKeys(Password);

	}
	
	@And("Select the {string}")
	public void selectWardType(String ward) {
		WebElement wardType = locateElement("id", ward);
		wardType.click();
	}
	
	
	@And("Select the Isolation ward")
	public void selectIsolationWard() {
		WebElement isolationWard = locateElement("id", "Isolation Ward");
		isolationWard.click();
	}
	
	@And("Select login")
	public void selectLogin() {
		locateElement("id", "loginButton").click();
	}
	
	@Then ("Validate login is success")
	public void validateLogin() {
		String loginName = locateElement("xpath", "//div[@id='content']//h4").getText();
		Assert.assertTrue(loginName.contains("Super User (admin)"));

	}
	@Then("Enter InvalidUsername")
	public void InvaliduserName() {
		WebElement InvaliduserName = locateElement("id", "Invalidusername");
		InvaliduserName.sendKeys("Admin");
	}
	@And("Enter Invalid Password")
	public void invalidPassword() {
		WebElement invalidpassword = locateElement("id", "invalidpassword");
		invalidpassword.sendKeys("Admin123");
}
/*
 * @And("Select the Isolation ward") public void selectIsolationWard1() {
 * WebElement isolationWard = locateElement("id", "Isolation Ward");
 * isolationWard.click(); }
 */
}
