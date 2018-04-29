package com.ClientA.cucumber.ZovixTest;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AC_001_SampleBanking_StepDefinition {
	WebDriver driver;
	
	@Given("^a user access the bank web app$")
	public void a_user_access_the_bank_web_app() throws Throwable {
		driver = new ChromeDriver();
		driver.navigate().to("http://www.mykidsbank.org");
	}

	@Given("^logs using the credentials$")
	public void logs_using_the_credentials(DataTable table) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    List<List<String>> data = table.raw();
	    
	    driver.findElement(By.name("bank_id")).sendKeys(data.get(1).get(0));
	    driver.findElement(By.name("username")).sendKeys(data.get(1).get(1));
	    driver.findElement(By.name("password")).sendKeys(data.get(1).get(2));
	    
	    // click the login button
	    driver.findElement(By.className("login_submit_button_class")).click();
	}

	@Given("^my checking account has a balance equal or greater than zero$")
	public void my_checking_account_has_a_balance_equal_or_greater_than_zero() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^I deposit (\\d+) to my checking account$")
	public void i_deposit_to_my_checking_account(int deposit_value) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("desc")).sendKeys("Weekly salary deposit");
		driver.findElement(By.name("amount")).sendKeys(String.valueOf(deposit_value));
		
	}

	@Then("^I should have additional (\\d+) as balance$")
	public void i_should_have_additional_as_balance(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Given("^my checking account has balance greater than (\\d+) before withdraw$")
	public void my_checking_account_has_balance_greater_than_before_withdraw(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^I withdraw (\\d+) from my checking account$")
	public void i_withdraw_from_my_checking_account(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
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
		
		//Assert.assertArrayEquals((dBeforeBalance - arg1), dAfterBalance, 0);
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
