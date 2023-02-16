package element_Segeration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class continues_Hotel {
	public  WebDriver driver;
	@FindBy(xpath = "//input[@name='radiobutton_0']")
	private static WebElement select;
	@FindBy(xpath = "//input[@name='continue']")
	private static WebElement continues;
	
	public WebElement getSelect() {
		return select;
	}
	public WebElement getContinues() {
		return continues;
	}
	public continues_Hotel(WebDriver driver04) {
		this.driver = driver04;
		PageFactory.initElements(driver, this);
	}
}
