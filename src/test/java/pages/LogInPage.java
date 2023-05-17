package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class LogInPage extends Base{
	@FindBy(xpath="//a[contains(text(),'Login')]")
	WebElement loginButton;
	@FindBy(xpath="//input[@name='mobile']")
	WebElement mobileNumber;
	@FindBy(xpath="//input[@type='submit']")//  //a[@class='a-ayg']
	WebElement logInButn;
public LogInPage() {
	PageFactory.initElements(driver, this);
}
public void logInMethod(String mobileNumber) {
	clickElement(loginButton);
	addText(this.mobileNumber,mobileNumber);
	clickElement(logInButn);
}


}
