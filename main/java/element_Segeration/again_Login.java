package element_Segeration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class again_Login {
	public  WebDriver driver;
	@FindBy(xpath = "//a[text()= 'Click here to login again']")
	private static WebElement Againlogin;
	
	public WebElement getAgainlogin() {
		return Againlogin;
	}
	public again_Login(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
}
