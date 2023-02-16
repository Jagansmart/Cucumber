package element_Segeration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_Pom {
public WebDriver driver;
	
	@FindBy(id = "username")
	private static  WebElement username;
	@FindBy(xpath = "//input[@id='password']")
	private static WebElement password;
	@FindBy(xpath = "//input[@id='username']//following::input[@type='Submit']")
	private static WebElement Dynamic_login;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getDynamic_login() {
		return Dynamic_login;
	}
	public login_Pom(WebDriver driver02) {
		this.driver = driver02;
		PageFactory.initElements(driver, this);
	}
}
