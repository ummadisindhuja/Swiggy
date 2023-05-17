package testCase;

import org.testng.annotations.Test;

import base.Base;
import pages.SignUpPage;

public class SignUpTC extends Base {
	@Test
	public void tc_001() throws Exception {//-----------failed
		SignUpPage details = new SignUpPage();
	    details.signUpMethod("8522098804", "ummadi sindhuja", "ummadimails.ummadisindhuja@gmail.com");
	}
	@Test
	public void tc_002() throws Exception {
		SignUpPage details = new SignUpPage();
	    details.signUpMethod("   ", "ummadi sindhuja", "ummadimails.ummadisindhuja@gmail.com");
	}
	@Test
	public void tc_003() throws Exception {
		SignUpPage details = new SignUpPage();
	    details.signUpMethod("000000", "ummadi indhu", "ummadimails.ummadisindhuja@gmail.com");
	}
	@Test
	public void tc_004() throws Exception {
		SignUpPage details = new SignUpPage();
	    details.signUpMethod("000000", "ummadi indhu", "ummadimails.ummadisindhuja@hmail.com");
	}
	@Test
	public void tc_005() throws Exception {
		SignUpPage details = new SignUpPage();
	    details.signUpMethod("000000", "ummadi indhu", "   ");
	}
}
