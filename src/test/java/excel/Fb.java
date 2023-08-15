package excel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.ctc.wstx.util.DataUtil;

public class Fb {

		@Test(dataProvider = "getData", dataProviderClass = Arraydata.class)
	public  void login(String  data[] ) {
			
			System.err.println("Email: " +data[0]);
			System.err.println("Pass: "+data[1]);
			
			
			
		
			
	WebDriver i  = new FirefoxDriver();
	i.get("https://www.facebook.com/login/");
		i.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	i.findElement(By.id("email")).sendKeys(data[0]);
	i.findElement(By.id("pass")).sendKeys(data[1]);
	i.findElement(By.id("loginbutton")).click();
		

	}

}
