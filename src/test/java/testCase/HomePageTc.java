package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Base;
import pages.HomePage;

public class HomePageTc extends Base {
	@Test
	public void tc_001() throws InterruptedException {//----fail
		HomePage page= new HomePage();
	    page.homePageLocation("kadapa");
	
	}
	@Test
	public void tc_002() throws InterruptedException {//passed
		HomePage page= new HomePage();
	    page.homePageLocation("   ");
	    String act="Enter your delivery ";
	    String exp=page.locationMessage();
	    Assert.assertEquals(act, exp);
	
	}
	@Test
	public void tc_003() {//passed
		HomePage link =new HomePage();
		link.homeCityLink();
		link.previousPage();
		link.homeCityLink2();
	}

}
