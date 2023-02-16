package com.Adactin.Stepdefinition;

import org.openqa.selenium.WebDriver;

import com.Adactin.runner.Runner_Adactin;

import BDD.Cucumber.Reusable_Methods;
import BDD.Cucumber.Segeration;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class step_Adactin extends Reusable_Methods{
	public static WebDriver driver = Runner_Adactin.driver;

	public static Segeration  ll = new Segeration(driver);
	
	@Given("user can able to launch the URL")
	public void user_can_able_to_launch_the_url() {
	   get_Url("https://adactinhotelapp.com/");
	}
	@When("user can able to enter the username in the text box")
	public void user_can_able_to_enter_the_username_in_the_text_box() {
		inputvalue_Sendkeys(ll.getLogin().getUsername(), "dhanacheziyen");
	}
	@When("user can able to enter the password in the password field")
	public void user_can_able_to_enter_the_password_in_the_password_field() {
	    inputvalue_Sendkeys(ll.getLogin().getPassword(), "123456789");
	}
	@Then("user can able to click the login button and navigate to next page")
	public void user_can_able_to_click_the_login_button_and_navigate_to_next_page() {
	    Click(ll.getLogin().getDynamic_login());
	}

	@When("user can able to search the location in the location field")
	public void user_can_able_to_search_the_location_in_the_location_field() {
	   Click(ll.getHotel().getLocation());
	}

	@When("user can able to search the hotels in the hotels field")
	public void user_can_able_to_search_the_hotels_in_the_hotels_field() {
	    Click(ll.getHotel().getHotel());
	}

	@When("user can able to search the Room Type in the Room Type field")
	public void user_can_able_to_search_the_room_type_in_the_room_type_field() {
	    Click(ll.getHotel().getRoom_type());
	}

	@When("user can able to select the No_of_room in the No_of_room field")
	public void user_can_able_to_select_the_no_of_room_in_the_no_of_room_field() {
	   Click(ll.getHotel().getNumberof_Nos());
	}

	@When("user can able to choose the check in date in the check in date field")
	public void user_can_able_to_choose_the_check_in_date_in_the_check_in_date_field() throws Throwable {
	 
	}

	@When("user can able to choose the check out date in the check out date field")
	public void user_can_able_to_choose_the_check_out_date_in_the_check_out_date_field() throws Throwable {
	    
	}

	@When("user can able to select the Adults per Room in the Adults per Room field")
	public void user_can_able_to_select_the_adults_per_room_in_the_adults_per_room_field() {
	   Click(ll.getHotel().getAdults_per_room());
	}

	@When("user can able to select the Children per room in the Children per room field")
	public void user_can_able_to_select_the_children_per_room_in_the_children_per_room_field() {
	    Click(ll.getHotel().getChildren_per_room());
	}

	@Then("user can able to click the search button and navigate to next page")
	public void user_can_able_to_click_the_search_button_and_navigate_to_next_page() {
	   Click(ll.getHotel().getSearch());
	}
	
	@When("user can click the Radio Icon")
	public void user_can_click_the_radio_icon() {
	    Click(ll.getSelect().getSelect());
	}

	@Then("user can able to Click the Continue button and navigte to next page")
	public void user_can_able_to_click_the_continue_button_and_navigte_to_next_page() {
	   Click(ll.getSelect().getContinues());
	}

	@When("user can able to enter the first name in the text box")
	public void user_can_able_to_enter_the_first_name_in_the_text_box() {
	    inputvalue_Sendkeys(ll.getBooking().getFirst_Name(), "Dhanacheziyen");
	}

	@When("user can able to enter the last name in the text box")
	public void user_can_able_to_enter_the_last_name_in_the_text_box() {
	   inputvalue_Sendkeys(ll.getBooking().getLast_Name(), "Kumar");
	}

	@When("user can able to enter the Billing Address in the Billing Address field")
	public void user_can_able_to_enter_the_billing_address_in_the_billing_address_field() {
	    inputvalue_Sendkeys(ll.getBooking().getBilling_addr(), "No.566, 67rd street Cross ,punjab Road,India");
	}

	@When("user can able to enter the Credit card no in the Credit card no field")
	public void user_can_able_to_enter_the_credit_card_no_in_the_credit_card_no_field() {
	   inputvalue_Sendkeys(ll.getBooking().getCreditno(), "4646565897465613");
	}

	@When("user can able to select the Credit card type in the Credit card type field")
	public void user_can_able_to_select_the_credit_card_type_in_the_credit_card_type_field() {
		Click(ll.getBooking().getCredit_card());
	}
	

	@When("user can able to select the Month of Expiry date in the Month of Expiry date field")
	public void user_can_able_to_select_the_month_of_expiry_date_in_the_month_of_expiry_date_field() {
	    Click(ll.getBooking().getExpiry_start());
	}

	@When("user can able to select the year of Expiry date in the year of Expiry date field")
	public void user_can_able_to_select_the_year_of_expiry_date_in_the_year_of_expiry_date_field() {
	    Click(ll.getBooking().getExpiry_End());
	}

	@When("user can able to enter the Cvv No in the Cvv No field")
	public void user_can_able_to_enter_the_cvv_no_in_the_cvv_no_field() {
	   inputvalue_Sendkeys(ll.getBooking().getCvv(), "564");
	}

	@Then("user can able to click the Book Now button and navigate to next page")
	public void user_can_able_to_click_the_book_now_button_and_navigate_to_next_page() {
	    Click(ll.getBooking().getBook_now());
	}

	@Then("user can able to click the logout button and navigate to next page")
	public void user_can_able_to_click_the_logout_button_and_navigate_to_next_page() {
		Click(ll.getBooking().getLogout());
	}

	@Then("user can able to click the click here to login again button and navigate to next page")
	public void user_can_able_to_click_the_click_here_to_login_again_button_and_navigate_to_next_page() {
	    Click(ll.getLoginpage().getAgainlogin());
	}


}
