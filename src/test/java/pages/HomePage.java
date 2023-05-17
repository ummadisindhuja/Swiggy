package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import base.Base;

public class HomePage extends Base{
	@FindBy(xpath="//input[@id='location']")
	WebElement location;
	@FindBy(xpath="//span[contains(text(),'FIND FOOD')]")
	WebElement findByButton;
	@FindBy(xpath="//a[contains(text(),'Chennai')]")
	WebElement city1;
	@FindBy(xpath="//a[contains(text(),'Hyderabad')]")
	WebElement city2;
	@FindBy(xpath="//div[contains(text(),'Enter your delivery location')]")
	WebElement loctionMsg;
public HomePage() {
	PageFactory.initElements(driver, this);
}
public void homePageLocation(String location) throws InterruptedException {
	addText(this.location, location);
	Thread.sleep(3000);
	clickElement(findByButton);
}

public void homeCityLink() {
	clickElement(city1);
	
}

	
public void homeCityLink2() {
	
	clickElement(city2);
}
public String locationMessage() {
	return loctionMsg.getText();
	}
}

