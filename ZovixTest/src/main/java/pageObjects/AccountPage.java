package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
	WebDriver driver;
	
	public AccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	} 
	
	@FindBy(how = How.ID, using = "2")
	private WebElement text_Balance;
	
	@FindBy(how = How.XPATH, using = "/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[3]/table/tbody/tr/td[3]/table/tbody/tr[3]/td/span")
	private WebElement link_Deposit;
	
	@FindBy(how = How.XPATH, using = "/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[3]/table/tbody/tr/td[3]/table/tbody/tr[4]/td/span")
	private WebElement link_Withdraw;
	
	public double getBalance() {
		String sBalance = text_Balance.getText();
		double dBalance = 0.0;
		
		// Convert value into double type
		sBalance = sBalance.replace("$", "");
		sBalance = sBalance.replace(",", "");
		sBalance = sBalance.trim();
		dBalance = Double.valueOf(sBalance);
		
		return dBalance;
	}
	
	public void click_Deposit() {
		link_Deposit.click();
	}
	
	public void click_Withdraw() {
		link_Withdraw.click();
	}
}
