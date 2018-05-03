package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.AccountPage;
import pageObjects.DepositPage;
import pageObjects.HomePage;
import pageObjects.WithdrawPage;

public class PageObjectManager {

	private WebDriver driver;
	private HomePage homePage;
	private AccountPage acctPage;
	private DepositPage depositPage;
	private WithdrawPage withdrawPage;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public HomePage getHomePage() {
		return (homePage == null) ? homePage = new HomePage(driver) : homePage;
	}
	
	public AccountPage getAccountPage() {
		return (acctPage == null) ? acctPage = new AccountPage(driver) : acctPage;
	}
	
	public DepositPage getDepositPage() {
		return (depositPage == null) ? depositPage = new DepositPage(driver) : depositPage;
	}
	
	public WithdrawPage getWithdrawPage() {
		return (withdrawPage == null) ? withdrawPage = new WithdrawPage(driver) : withdrawPage;
	}
}
