package org.nav.seleniumbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Launchbase {
	
	String url ="https://www.saucedemo.com/";
	
	protected static RemoteWebDriver dr  = null;
	
	
	public void Startweb() {
		dr = new FirefoxDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		dr.get(url);
		
		
	}
	
	public void closeweb() {
		dr.close();
		
	}

}
