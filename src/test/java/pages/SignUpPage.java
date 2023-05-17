package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class SignUpPage extends Base {
	@FindBy(xpath = "//a[contains(text(),'Sign up')]")
	WebElement signUpButton;
	@FindBy(xpath = "//input[@name='mobile']")
	WebElement mobileNumber;
	@FindBy(xpath = "//input[@name='name']")
	WebElement name;
	@FindBy(xpath = "//input[@name='email']")
	WebElement email;
	@FindBy(xpath = "//input[@type='submit']")
	WebElement continuebutton;

	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}

	public void signUpMethod(String mobileNumber, String name, String email) {
		clickElement(signUpButton);
		addText(this.mobileNumber, mobileNumber);
		addText(this.name, name);
		addText(this.email, email);
		clickElement(continuebutton);
	}

}
