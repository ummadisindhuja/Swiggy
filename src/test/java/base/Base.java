package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utility.SwiggyUtils;

public class Base extends SwiggyUtils {
	@BeforeMethod
	public void start() throws Exception {
		browserLaunch(getpropvalue("browser"));
		launchUrl(getpropvalue("url"));

	}

	@AfterMethod
	public void close() {
		//driver.quit();
	}
}
