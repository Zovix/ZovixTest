package com.ClientA.cucumber.ZovixTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.PageObjectManager;
import pageObjects.AccountPage;
import pageObjects.DepositPage;
import pageObjects.HomePage;
import pageObjects.WithdrawPage;

public class AC_001_SampleBanking_StepDefinition {
	WebDriver driver;
	HomePage home;
	AccountPage acct;
	DepositPage deposit;
	WithdrawPage withdraw;
	PageObjectManager pageObjManager;
	double dBeforeBalance = 0.0;
	
	@Given("^a user access the bank web app$")
	public void a_user_access_the_bank_web_app() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:/My Development/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		pageObjManager = new PageObjectManager(driver);
		home = pageObjManager.getHomePage();
		home.navigateToHomePage();
	}

	@Given("^logs using the credentials$")
	public void logs_using_the_credentials(DataTable table) throws Throwable {
	    List<List<String>> data = table.raw();
	  	    
	    home.enter_BankID(data.get(1).get(0));
	    home.enter_Username(data.get(1).get(1));
	    home.enter_Password(data.get(1).get(2));
	    home.ClickON_Login();
	}

	@Given("^my checking account has a balance equal or greater than zero$")
	public void my_checking_account_has_a_balance_equal_or_greater_than_zero() throws Throwable {
		acct = pageObjManager.getAccountPage();
				
		Assert.assertTrue(acct.getBalance() >= 0.0);
	}

	@When("^I deposit (\\d+) to my checking account$")
	public void i_deposit_to_my_checking_account(int deposit_value) throws Throwable {
		acct = pageObjManager.getAccountPage();
		
		// Record the starting balance
		dBeforeBalance = acct.getBalance();
		
		// Click on the link to make deposits
		acct.click_Deposit();	
		
		deposit = pageObjManager.getDepositPage();
		
		// Enter deposit description, amount, check the "checking-account" checkbox and submit the deposit
		deposit.enter_Description("Weekly salary deposit");
		deposit.enter_Amount(String.valueOf(deposit_value));
		deposit.check_Checking();
		
		// Submit the deposit
		deposit.ClickON_Submit();
		deposit.ClickON_SubmitConfirm();
	}

	@Then("^I should have additional (\\d+) as balance$")
	public void i_should_have_additional_as_balance(int deposit_value) throws Throwable {
		acct = pageObjManager.getAccountPage();
		
		Assert.assertTrue(dBeforeBalance + deposit_value == acct.getBalance());
	}

	@Given("^my checking account has balance greater than (\\d+) before withdraw$")
	public void my_checking_account_has_balance_greater_than_before_withdraw(int arg1) throws Throwable {
		acct = pageObjManager.getAccountPage();
		
		// Check that the account has the funds.
		Assert.assertTrue(acct.getBalance() > arg1);
	}

	@When("^I withdraw (\\d+) from my checking account$")
	public void i_withdraw_from_my_checking_account(int withdrawn_amount) throws Throwable {
		// Record the starting balance
		acct = pageObjManager.getAccountPage();
		dBeforeBalance = acct.getBalance();
		
		// Click on the link to make withdraws
		acct.click_Withdraw();
		
		withdraw = pageObjManager.getWithdrawPage();
		
		// Enter deposit description, amount, check the "checking-account" check-box and submit the deposit
		withdraw.enter_Description("cash needed");
		withdraw.enter_Amount(String.valueOf(withdrawn_amount));
		withdraw.check_Checking();
		
		// submit the withdraw
		withdraw.ClickON_Submit();
		withdraw.ClickON_SubmitConfirm();
}

	@Then("^I should have less (\\d+) as balance$")
	public void i_should_have_less_as_balance(int arg1) throws Throwable {
		acct = pageObjManager.getAccountPage();
		
		Assert.assertEquals((dBeforeBalance - arg1), acct.getBalance(), 0);
	}

	@Given("^Transfer page is loaded$")
	public void transfer_page_is_loaded() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Given("^form to transfer funds is populated$")
	public void form_to_transfer_funds_is_populated() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^I confirm to complete transfer operation$")
	public void i_confirm_to_complete_transfer_operation() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^A confirmation is displayed$")
	public void a_confirmation_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}
}
