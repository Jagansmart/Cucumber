package element_Segeration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	public WebDriver driver;
	@FindBy(xpath = "//select[@name='location']//option[6]")
	private static WebElement Location;
	@FindBy(xpath = "//html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[3]/td[2]/select//option[4]")
	private static WebElement Hotel;
	@FindBy(xpath = "//select[@name='room_type']//option[3]")
	private static WebElement Room_type;
	@FindBy(xpath = "//select[@name='room_nos']//option[4]")
	private static WebElement Numberof_Nos;
	@FindBy(xpath = "//select[@id='adult_room']//option[3]")
	private static WebElement Adults_per_room;
	@FindBy(xpath = "//select[@name='child_room']//option[1]")
	private static WebElement Children_per_room;
	@FindBy(xpath = "//input[@value='Search']")
	private static WebElement search;
	
	
	


	public WebElement getLocation() {
		return Location;
	}



	public  WebElement getHotel() {
		return Hotel;
	}



	public  WebElement getRoom_type() {
		return Room_type;
	}



	public  WebElement getNumberof_Nos() {
		return Numberof_Nos;
	}



	public WebElement getAdults_per_room() {
		return Adults_per_room;
	}



	public  WebElement getChildren_per_room() {
		return Children_per_room;
	}



	public WebElement getSearch() {
		return search;
	}



	public Search_Hotel(WebDriver driver03) {
		this.driver = driver03;
		PageFactory.initElements(driver, this);
	}
}
