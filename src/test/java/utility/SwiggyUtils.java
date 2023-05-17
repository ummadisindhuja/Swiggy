package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwiggyUtils {
	public static WebDriver driver;

	public static void launchUrl(String url) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	}

	public static String getpropvalue(String key) throws Exception {
		String projectPath = System.getProperty("user.dir");
		File file = new File(projectPath + "/config.properties");
		FileInputStream fileInput = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fileInput);
		return prop.get(key).toString();
	}

	// Browser Launch
	// @SuppressWarnings("deprecation")
	public static void browserLaunch(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
	}

	public static void waitImplicit() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public boolean waitforme(WebElement element) {
		try {
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(element));
		return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	

	// Check for element availability
	/*
	 * public static boolean waitforme(WebElement element) { boolean flag = false;
	 * 
	 * try {
	 * 
	 * WebDriverWait wait = new WebDriverWait(driver, 15);
	 * wait.until(ExpectedConditions.visibilityOf(element));
	 * wait.until(ExpectedConditions.elementToBeClickable(element));
	 * 
	 * // test.log(Status.PASS, id + "is available"); flag = true; } catch
	 * (Exception e) {
	 * System.out.println("Error occured while waiting for the element :" +
	 * "with exception " + e.getMessage()); // test.log(Status.FAIL, id +
	 * "is not available");
	 * 
	 * } return flag; }
	 */
	// Click a Web Element

	public void clickElement(WebElement element) {
		waitforme(element);
		element.click();
	}

	public void addText(WebElement element, String txt) {
		try {

			if (waitforme(element)) {
				element.sendKeys(txt);

				// test.log(Status.PASS, id + "is clicked ");
			}
		} catch (Exception e) {
			System.out.println("Error in typing the webelement :" + e.getMessage());
			// test.log(Status.FAIL, "Failed to click the element :" + id);
		}

	}

	/*
	 * public void addInt(WebElement element, CharSequence[] mobileNumber) { try {
	 * 
	 * if (waitforme(element)) { element.sendKeys(mobileNumber);
	 * 
	 * // test.log(Status.PASS, id + "is clicked "); } } catch (Exception e) {
	 * System.out.println("Error in typing the webelement :" + e.getMessage()); //
	 * test.log(Status.FAIL, "Failed to click the element :" + id); }
	 * 
	 * }
	 */
	public void previousPage() {
		driver.navigate().back();
	}

	public void nextPage() {
		driver.navigate().forward();
	}

}
