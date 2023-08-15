package org.nav.pages;

import org.nav.seleniumbase.Launchbase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tc001login extends Launchbase{
@Test
	public void Logintest() {
		
		/*
		 * Loginpage lp = new Loginpage();lp.enterUserName(null);
		 * lp.enterPassword(null);
		 */
		
		Loginpage lp = new Loginpage();
		boolean username = lp.getusername();
		Assert.assertEquals(username, true);
		boolean password = lp.getpassword();
		Assert.assertTrue(password);
		
	
		new Loginpage()
		.enterUserName("standard_user")
		.enterPassword("secret_sauce")
		.clicklogin();
		 
		 
		
		
	}
}
