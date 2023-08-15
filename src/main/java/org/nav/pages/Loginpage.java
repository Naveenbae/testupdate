package org.nav.pages;

import org.nav.seleniumbase.Launchbase;
import org.openqa.selenium.By;



public class Loginpage extends Launchbase {
	

	//Locator
	public boolean getusername() {
		return dr.findElement(By.xpath("//input[@placeholder='Username']")).isDisplayed();
	
	}
	
	public boolean getpassword() {
		return dr.findElement(By.xpath("//input[@placeholder='Password']")).isDisplayed();
	}

	
	
	
	//actions
	/**
	 * 
	 * @describition  - get user name for first field
	 * @param username - pass the user to login
	 * @return 
	 * @return 
	 */
	public Loginpage enterUserName(String username){
		dr.findElement(By.id("user-name")).sendKeys(username);
		return this;
	}
	public Loginpage enterPassword(String password){
		dr.findElement(By.id("password")).sendKeys(password);
		return this;
	}
	public Loginpage clicklogin(){
		dr.findElement(By.id("login-button")).click();
		return new Loginpage();
	}
	
		/**
		 * 
		 * @describition using for login purpus
		 * @param username
		 * @param password
		 */
		public void login(String username,String password) {
			
			enterUserName(username);
			enterPassword(password);
			clicklogin();
			
	//
	
		}

}
