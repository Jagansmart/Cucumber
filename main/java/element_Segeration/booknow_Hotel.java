package element_Segeration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class booknow_Hotel {
	private static WebDriver driver;
	@FindBy(xpath = "//input[contains(@name,'first_name')]")
	private static WebElement first_Name;
	@FindBy(xpath = "//input[contains(@name,'last_name')]")
	private static WebElement last_Name;
	@FindBy(xpath = "//textarea[contains(@name,'address')]")
	private static WebElement Billing_addr;
	@FindBy(xpath = "//input[contains(@name,'cc_num')]")
	private static WebElement creditno;
	@FindBy(xpath = "//select[@id='cc_type']//option[3]")
	private static WebElement credit_card;
	@FindBy(xpath = "//select[@name='cc_exp_month']//option[13]")
	private static WebElement Expiry_start;
	@FindBy(xpath = "//select[@name='cc_exp_year']//option[13]")
	private static WebElement Expiry_End;
	@FindBy(xpath = "//input[@id='cc_cvv']")
	private static WebElement Cvv;
	@FindBy(xpath = "(//input[@type='button'])[1]")
	private static WebElement Book_now;
	@FindBy(xpath = "//a[@href=\"Logout.php\"]")
	private static WebElement logout;
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getFirst_Name() {
		return first_Name;
	}
	public WebElement getLast_Name() {
		return last_Name;
	}
	public WebElement getBilling_addr() {
		return Billing_addr;
	}
	public WebElement getCreditno() {
		return creditno;
	}
	public WebElement getCredit_card() {
		return credit_card;
	}
	public WebElement getExpiry_start() {
		return Expiry_start;
	}
	public WebElement getExpiry_End() {
		return Expiry_End;
	}
	public WebElement getCvv() {
		return Cvv;
	}
	public WebElement getBook_now() {
		return Book_now;
	}
	public WebElement getLogout() {
		return logout;
	}
	public booknow_Hotel(WebDriver driver05) {
		this.driver = driver05;
		PageFactory.initElements(driver, this);
	}
}
