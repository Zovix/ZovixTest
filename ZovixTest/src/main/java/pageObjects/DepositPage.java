package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DepositPage {
	WebDriver driver;
	
	public DepositPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.NAME, using = "desc")
	private WebElement txtbx_Description;
	
	@FindBy(how = How.NAME, using = "amount")
	private WebElement txtbx_Amount;
	
	@FindBy(how = How.ID, using = "a0")
	private WebElement chkbx_Checking;
	
	@FindBy(how = How.ID, using = "a1")
	private WebElement chkbx_Savings;
	
	@FindBy(how = How.XPATH, using = "/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[3]/form/table/tbody/tr/td/table/tbody/tr[10]/td/table/tbody/tr/td[1]/span")
	private WebElement button_Submit;
	
	@FindBy(how = How.XPATH, using = "/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[3]/table/tbody/tr/td/table/tbody/tr[6]/td/div[2]/span[1]")
	private WebElement button_SubmitConfirm;
	
	@FindBy(how = How.XPATH, using = "/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[3]/form/table/tbody/tr/td/table/tbody/tr[10]/td/table/tbody/tr/td[3]/span")
	private WebElement button_Cancel;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"check_uncheck_boxes_id\"]")
	private WebElement button_SelectAll;
	
	public void enter_Description(String desc) {
		txtbx_Description.sendKeys(desc);
	}
	
	public void enter_Amount(String amount) {
		txtbx_Amount.sendKeys(amount);
	}
	
	public void check_Checking() {
		chkbx_Checking.click();
		try { Thread.sleep(1000); }
		catch (InterruptedException e) {}
	}
	
	public void check_Savings() {
		chkbx_Savings.click();
		try { Thread.sleep(1000); }
		catch (InterruptedException e) {}
	}
	
	public void ClickON_Submit() {
		button_Submit.click();
	}
	
	public void ClickON_SubmitConfirm() {
		button_SubmitConfirm.click();
	}
	
	public void ClickON_Cancel() {
		button_Cancel.click();
	}
	
	public void ClickON_SelectAll() {
		button_SelectAll.click();
	}
}
