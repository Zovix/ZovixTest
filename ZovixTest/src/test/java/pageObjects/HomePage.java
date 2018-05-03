package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.NAME, using = "bank_id")
	private WebElement txtbx_BankID;
	
	@FindBy(how = How.NAME, using = "username")
	private WebElement txtbx_Username;
	
	@FindBy(how = How.NAME, using = "password")
	private WebElement txtbx_Password;
	
	@FindBy(how = How.CLASS_NAME, using = "login_submit_button_class")
	private WebElement button_Login;
	
	public void enter_BankID(String value) {
		txtbx_BankID.sendKeys(value);
	}
	
	public void enter_Username(String value) {
		txtbx_Username.sendKeys(value);
	}
	
	public void enter_Password(String value) {
		txtbx_Password.sendKeys(value);
	}
	
	public void ClickON_Login() {
		button_Login.click();
	}
}
