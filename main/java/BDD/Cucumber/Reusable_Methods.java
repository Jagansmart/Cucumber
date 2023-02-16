package BDD.Cucumber;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Reusable_Methods {
	public static WebDriver driver;
	
	// Browser Launch driver
	public static WebDriver browser_Launch(String a) {
		if (a.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\rjaga\\eclipse-workspace\\Seleniumjava\\driver\\msedgedriver.exe");
			driver = new EdgeDriver();
		} else if (a.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.firefox.driver", "C:\\Users\\rjaga\\eclipse-workspace\\Seleniumjava\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if (a.equalsIgnoreCase("InternetExplorer")) {
			System.setProperty("webdriver.internetexplorer.driver", "C:\\Users\\rjaga\\eclipse-workspace\\Seleniumjava\\driver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}else if (a.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\rjaga\\eclipse-workspace\\Seleniumjava\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if (a.equalsIgnoreCase("Opera")) {
			System.setProperty("webdriver.opera.driver", "C:\\Users\\rjaga\\eclipse-workspace\\Seleniumjava\\driver\\operadriver.exe");
//			driver = new OperaDriver();
		}	 
		//driver.get("https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/#downloads");
		//driver.get("https://chromedriver.storage.googleapis.com/99.0.4844.51/notes.txt");
		//driver.manage().window().maximize();
		//driver.navigate().to("https://chromedriver.chromium.org/downloads");
		return driver;
	
	}
	public static void get_Url(String Url) {
		driver.get(Url);

	}
	public static void maximize() {
		driver.manage().window().maximize();

	}
	public static void navigate_To(String Url) {
		driver.navigate().to(Url);

	}
	public static void navigate_Back() {
		driver.navigate().back();

	}
	public static void navigate_Forward() {
		driver.navigate().forward();

	}
	public static void navigate_Refresh() {
		driver.navigate().refresh();

	}
	public static void Click(WebElement element) {
		element.click();

	}
	public static void actions_Methods(String ac, WebElement element) {
		Actions method = new Actions(driver);
		if (ac.equalsIgnoreCase("contextclick")) {
			method.contextClick(element).build().perform();
		}else if (ac.equalsIgnoreCase("doubleclick")) {
			method.doubleClick(element).build().perform();
		}else if (ac.equalsIgnoreCase("clickandhold")) {
			method.clickAndHold(element).build().perform();
		}else if (ac.equalsIgnoreCase("release")) {
			method.release(element).build().perform();
		}

	}
	public static void moveto_Element(WebElement element) {
		try {
			Actions move = new Actions(driver);
			move.moveToElement(element).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void drag_Anddrop(WebElement src, WebElement tar) {
		try {
			Actions drag = new Actions(driver);
			drag.dragAndDrop(src, tar).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public static void robot_Method(int keycode) throws AWTException {
		Robot r = new Robot();
		r.keyPress(keycode);

	}
	public static void close() {
		driver.close();

	}
	public static void quit() {
		driver.quit();

	}
	public static String current_Url() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}
	public static String Get_Title() {
		String title = driver.getTitle();
		return title;

	}
	public static void default_Content() {
		try {
			driver.switchTo().defaultContent();
		} catch ( Exception e) {
			e.printStackTrace();
		}

	}
	public static void explicit_Wait(WebDriver driver, Duration seconds, By locator) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, seconds);
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	@SuppressWarnings("deprecation")
	public static void implicit_Wait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		

	}
	public static void simple_Alert(WebElement element , String value) {
		try {
		WaitforElementVisibility(element);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.switchTo().defaultContent();
		driver.switchTo().alert().sendKeys(value);
		}
		catch (Exception e) {
			e.printStackTrace();
		}		

	}
	private static void WaitforElementVisibility(WebElement element) {
		WaitforElementVisibility(element);
		
	}
	public static void confirm_Alert(String ok, WebElement element) {
		try {
		WaitforElementVisibility(element);
		Alert confirm_Alert = driver.switchTo().alert();
		if (ok.equalsIgnoreCase("accept")) {
			confirm_Alert.accept();
			driver.switchTo().defaultContent();
		}else if (ok.equalsIgnoreCase("dismiss")) {
			confirm_Alert.dismiss();
			driver.switchTo().defaultContent();
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
			
		}
	public static void frame_Method(int index, String frame) {
		try {
		if (frame.equalsIgnoreCase("number")) {
			driver.switchTo().frame(index);
		}
		}catch (Exception e) {
			e.printStackTrace();
		}

	}
	public static void frame_id(String id , String name) {
		try {
		if (name.equalsIgnoreCase("name")) {
			driver.switchTo().frame(id);
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void frame_Element(WebElement element , String elements) {
		try {
		if (elements.equalsIgnoreCase("elements")) {
			driver.switchTo().frame(element);
		}
		}catch (Exception e) {
			e.printStackTrace();
		}

	}
	public static void screen_Shot(String filename) {
		try {
		TakesScreenshot ss = (TakesScreenshot) driver;
			File src = ss.getScreenshotAs(OutputType.FILE);
			File destin = new File(System.getProperty ("user.dir") + "\\ScreenShot\\" +filename + ".png");
			FileUtils.copyFile(src,destin);
		}
		catch (Exception e) {
			e.printStackTrace();
			}
	}
	public static void selectdrop_Downoption(String option, WebElement element,String value) {
		Select ss = new Select(element);
		if (option.equalsIgnoreCase("Index")) {
			ss.selectByIndex(Integer.parseInt(value));
		}else if (option.equalsIgnoreCase("visible")) {
			ss.selectByVisibleText(value);
			
		}else if (option.equalsIgnoreCase("value")) {
			ss.selectByValue(value);
		}

	}
	public static void is_Selected(WebElement element) {
		try {
		boolean selected = element.isSelected();
		System.out.println(selected);
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}
	public static boolean is_Multiple(WebElement element) {
		try {
			Select ss = new Select(element);
			boolean multiple = ss.isMultiple();
			return multiple;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;

	}
	
	public static void java_Script(WebElement element) {
		try {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}

	}
	public static void javascript_WindowSscrollsize(int i , int j) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo("+ i + "," + j +")" ," ");
			}
			catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException();
			}
	}
	public static void java_ScrollBy(int width, int height) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy("+ width + "," + height +")" ," ");
			}
			catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException();
			}
	}
	public static void Scroll_By(int width, int height) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy("+ width + "," + height +")" ," ");
			}
			catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException();
			}
	}
	public static void java_Argument(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", element);
			}
			catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException();
			}
	}
	public static boolean element_Isdisplayed(WebElement element) {
		try {
			boolean displayed = element.isDisplayed();
			return displayed;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public static boolean element_IsEnabled(WebElement element) {
		try {
			boolean enabled = element.isEnabled();
			return enabled;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	public static void inputvalue_Sendkeys(WebElement element , String value) {
		try {
			if (element_Isdisplayed(element)&& element_IsEnabled(element)) {
				element.sendKeys(value);			 
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}

	}
	public static void window_Handles(String weblink){
		try {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			//if (string.equalsIgnoreCase("link")) {
			if(!(string == weblink)) {
				driver.switchTo().window(weblink).getTitle();
			}
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void all_SelectedOption(WebElement element) {
		try {
		Select ls = new Select(element);
		List<WebElement> allSelectedOptions = ls.getAllSelectedOptions();
		for (WebElement webElement : allSelectedOptions) {
			 System.out.println(webElement.getText());
				
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void get_Option(WebElement element) {
		try {
			Select ls = new Select(element);
			List<WebElement> options = ls.getOptions();
			for (WebElement webElement : options) {
				System.out.println("Given Option : " + webElement.getText() );
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void first_Selectedoption(WebElement element) {
		try {
			Select ls = new Select(element);
			WebElement firstSelectedOption = ls.getFirstSelectedOption();
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public static String Get_Text(WebElement element) {
		try {
		String text = element.getText();
		return text;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}
	public static String get_Attribute(WebElement element , String value) {
		try {
			String attribute = element.getAttribute(value);
			return attribute;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}
	public static void check_Box(WebElement element) {
		try {
	
			check_Box(element);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	}
	
	
	


