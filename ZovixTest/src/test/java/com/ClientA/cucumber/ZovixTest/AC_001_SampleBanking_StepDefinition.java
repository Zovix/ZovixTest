package com.ClientA.cucumber.ZovixTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.AccountPage;
import pageObjects.DepositPage;
import pageObjects.HomePage;

public class AC_001_SampleBanking_StepDefinition {
	WebDriver driver;
	double dBeforeBalance = 0.0;
	
	@Given("^a user access the bank web app$")
	public void a_user_access_the_bank_web_app() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:/My Development/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://www.mykidsbank.org");
	}

	@Given("^logs using the credentials$")
	public void logs_using_the_credentials(DataTable table) throws Throwable {
	    List<List<String>> data = table.raw();
	    HomePage home = new HomePage(driver);
	    
	    home.enter_BankID(data.get(1).get(0));
	    home.enter_Username(data.get(1).get(1));
	    home.enter_Password(data.get(1).get(2));
	   
	    home.ClickON_Login();
	}

	@Given("^my checking account has a balance equal or greater than zero$")
	public void my_checking_account_has_a_balance_equal_or_greater_than_zero() throws Throwable {
		AccountPage acct = new AccountPage(driver);
				
		Assert.assertTrue(acct.getBalance() >= 0.0);
	}

	@When("^I deposit (\\d+) to my checking account$")
	public void i_deposit_to_my_checking_account(int deposit_value) throws Throwable {
		AccountPage acct = new AccountPage(driver);
		
		// Record the starting balance
		dBeforeBalance = acct.getBalance();
		
		// Click on the link to make deposits
		acct.click_Deposit();	
		
		DepositPage dep = new DepositPage(driver);
		
		// Enter deposit description, amount, check the "checking-account" checkbox and submit the deposit
		dep.enter_Description("Weekly salary deposit");
		dep.enter_Amount(String.valueOf(deposit_value));
		dep.check_Checking();
		
		// Submit the deposit
		dep.ClickON_Submit();
		
		// Deposit Confirmation page submit
		dep.ClickON_SubmitConfirm();
	}

	@Then("^I should have additional (\\d+) as balance$")
	public void i_should_have_additional_as_balance(int deposit_value) throws Throwable {
		String sBalance = driver.findElement(By.id("2")).getText();
		
		// Convert value into double type
		double dBalance = 0.0;
		sBalance = sBalance.replace("$", "");
		sBalance = sBalance.replace(",", "");
		sBalance = sBalance.trim();
		dBalance = Double.valueOf(sBalance);
		
		Assert.assertTrue(dBeforeBalance + deposit_value == dBalance);
	}

	@Given("^my checking account has balance greater than (\\d+) before withdraw$")
	public void my_checking_account_has_balance_greater_than_before_withdraw(int arg1) throws Throwable {
		String sBalance = driver.findElement(By.id("2")).getText();
		
		// Convert value into double type
		double dBalance = 0.0;
		sBalance = sBalance.replace("$", "");
		sBalance = sBalance.replace(",", "");
		sBalance = sBalance.trim();
		dBalance = Double.valueOf(sBalance);
		
		// Manual withdraw so check that it is allowed.
		Assert.assertTrue(dBalance > arg1);
	}

	@When("^I withdraw (\\d+) from my checking account$")
	public void i_withdraw_from_my_checking_account(int withdrawn_amount) throws Throwable {
		// Record the starting balance
		String sOldBalance = driver.findElement(By.id("2")).getText();
		
		// Convert value into double type
		sOldBalance = sOldBalance.replace("$", "");
		sOldBalance = sOldBalance.replace(",", "");
		sOldBalance = sOldBalance.trim();
		dBeforeBalance = Double.valueOf(sOldBalance);
		
		// Click on the link to make deposits
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[3]/table/tbody/tr/td[3]/table/tbody/tr[4]/td/span")).click();
		
		// Enter deposit description, amount, check the "checking-account" check-box and submit the deposit
		driver.findElement(By.name("desc")).sendKeys("cash needed");
		driver.findElement(By.name("amount")).sendKeys(String.valueOf(withdrawn_amount));
		Thread.sleep(1000);
		driver.findElement(By.id("a0")).click();
				
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[3]/form/table/tbody/tr/td/table/tbody/tr[10]/td/table/tbody/tr/td[1]/span")).click();
		Thread.sleep(1000);
		
		// Deposit Confirmation page submit
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[3]/table/tbody/tr/td/table/tbody/tr[6]/td/div[2]/span[1]")).click();
	}

	@Then("^I should have less (\\d+) as balance$")
	public void i_should_have_less_as_balance(int arg1) throws Throwable {
	    // Identify value from 2nd row in grid
		String sAfterBalance = driver.findElement(By.id("2")).getText();
		driver.close();
		
		// Convert value into double type
		double dAfterBalance = 0.0;
		sAfterBalance = sAfterBalance.replace("$", "");
		sAfterBalance = sAfterBalance.replace(",", "");
		sAfterBalance = sAfterBalance.trim();
		dAfterBalance = Double.valueOf(sAfterBalance);
		
		Assert.assertEquals((dBeforeBalance - arg1), dAfterBalance, 0);
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
