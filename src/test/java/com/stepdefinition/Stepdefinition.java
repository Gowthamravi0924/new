package com.stepdefinition;

import java.awt.Label;

import com.base.BaseClass;
import com.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition extends BaseClass {
	LoginPage lp;

	@Given("Verify the user is on facebook login page")
	public void verify_the_user_is_on_facebook_login_page() {

		loadUrl("https://www.facebook.com/");
	}

	@When("Verify the user  should enter the username {string} and password {string} .")
	public void verify_the_user_should_enter_the_username_and_password(String s1, String s2) {
		lp = new LoginPage();
		fill(s1, lp.getUserName().get(0));
		fill(s2, lp.getPassword().get(0));

	}

	@When("Verify the user should click the login button")
	public void verify_the_user_should_click_the_login_button() {
		lp = new LoginPage();
		buttonClk(lp.getLogin().get(0));
	}

	@Then("Verify the success message")
	public void verify_the_success_message() {
     System.out.println("execution is done");
	}

}
