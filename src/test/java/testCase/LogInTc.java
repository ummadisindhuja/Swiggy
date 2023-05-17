package testCase;

import org.testng.annotations.Test;

import base.Base;
import pages.LogInPage;

public class LogInTc extends Base {
	@Test
	public void tcValid_001() {//--------failed
		LogInPage logIn=new LogInPage();
		logIn.logInMethod("8522098804");// how to give numeric value or we have to use only string
	}
	@Test
	public void tcInvalid_001() {
		LogInPage logIn=new LogInPage();
		logIn.logInMethod("0000000000");
	}
	@Test
	public void tcBlank_001() {
		LogInPage logIn=new LogInPage();
		logIn.logInMethod("   ");
	}
}
