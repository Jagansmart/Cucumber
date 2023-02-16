package BDD.Cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import element_Segeration.Search_Hotel;
import element_Segeration.again_Login;
import element_Segeration.booknow_Hotel;
import element_Segeration.continues_Hotel;
import element_Segeration.login_Pom;

public class Segeration {
	public WebDriver driver;
	private login_Pom login;
	private Search_Hotel hotel;
	private continues_Hotel select;
	private booknow_Hotel booking;
	private again_Login loginpage;
	
	public login_Pom getLogin() {
		login = new login_Pom(driver);
		return login;	
	}
	public Search_Hotel getHotel() {
		hotel = new Search_Hotel(driver);
		return hotel;
	}
	public continues_Hotel getSelect() {
		select = new continues_Hotel(driver);
		return select;
	}
	public booknow_Hotel getBooking() {
		booking = new booknow_Hotel(driver);
		return booking;
	}
	public again_Login getLoginpage() {
		loginpage = new again_Login(driver);
		return loginpage;
	}
	public Segeration(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver , this);
	}

}
