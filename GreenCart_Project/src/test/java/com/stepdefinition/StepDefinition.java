package com.stepdefinition;

import java.io.IOException;

import com.baseclass.BaseClass;
import com.helper.File_Reader_Manager;
import com.pom.Page_Object_Manager;
import com.pom.PomPage01;
import com.pom.PomPage02;
import com.pom.PomPage03;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	
	
	Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	@Given("User launch the url")
	public void user_launch_the_url() throws IOException {
		
		String url = File_Reader_Manager.getInstanceCr().getUrl();
		getUrl(url);
	    
	}

	@When("User click the search for vegetables box and send the {string}")
	public void user_click_the_search_for_vegetables_box_and_send_the(String string) {
	
		
		pom.getPomPage01().getSearchBox().sendKeys(string);

	}

	@When("User click the add to cart button")
	public void user_click_the_add_to_cart_button() {
		
		pom.getPomPage01().getAddToCart().click();
	}

	@When("User click the items icon")
	public void user_click_the_items_icon() {
	
		
		pom.getPomPage01().getItems().click();
	}

	@When("User click the proceed to checkout button")
	public void user_click_the_proceed_to_checkout_button() {
			
		pom.getPomPage01().getProceedToCheckOut().click();
	}

	@Then("See page shown")
	public void see_page_shown() {
	
		System.out.println("Page Next");
	}
	
	@When("User Click enter a promo code")
	public void user_click_enter_a_promo_code() throws InterruptedException {
		Thread.sleep(2000);
	   
	   pom.getPomPage02().getPromoCode().sendKeys("1234");
	}
	@When("User Click the apply button")
	public void user_click_the_apply_button() throws InterruptedException {
		Thread.sleep(2000);
		
		pom.getPomPage02().getApply().click();
	}
	@When("User Click the place order button")
	public void user_click_the_place_order_button() {
	
		
		pom.getPomPage02().getPlaceOrder().click();
	}
	
	@When("User select the Country")
	public void user_select_the_country() throws InterruptedException {
		Thread.sleep(2000);

		selection(pom.getPomPage03().getSelect(), "byvalue", "India");
	}

	@When("User click the agree checkbox")
	public void user_click_the_agree_checkbox() throws InterruptedException {
		Thread.sleep(2000);

		pom.getPomPage03().getAgree().click();
	}

	@When("User click the proceed button")
	public void user_click_the_proceed_button() {
	
		pom.getPomPage03().getProceed().click();
		System.out.println("End");
	}

}
