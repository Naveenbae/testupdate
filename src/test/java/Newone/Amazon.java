package Newone;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Amazon {
	@Test
	public static void amazon() throws InterruptedException {
		WebDriver e = new FirefoxDriver();
		e.get("https://www.amazon.in/ref=nav_logo");
		e.manage().window().maximize();
		e.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		e.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone xr 128gb");
		Thread.sleep(2000);
		e.findElement(By.id("nav-search-submit-button")).click();

	
	//add product
		Thread.sleep(2000);
		JavascriptExecutor j =(JavascriptExecutor)e;
		j.executeScript("window.scroll(0,1050)", "");
		Thread.sleep(2000);
		e.findElement(By.partialLinkText("Apple iPhone 14 (256 GB) - Purple")).click();
		Set<String> wh = e.getWindowHandles();
		ArrayList a = new ArrayList(wh);
		e.switchTo().window((String)a.get(1));
			
			Thread.sleep(3000);
			JavascriptExecutor js =(JavascriptExecutor)e;
			js.executeScript("window.scroll(0,650)", "");
			e.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
			Thread.sleep(3000);
			e.findElement(By.xpath("(//a[@class='a-button-text'])[3]")).click();
			Thread.sleep(2000);
			e.findElement(By.xpath("(//input[@class='a-button-input'])[1]")).click();
			Thread.sleep(2000);
			e.findElement(By.id("ap_email")).sendKeys("9095133370");
			e.close();
			e.switchTo().window((String)a.get(0));
			Thread.sleep(3000);
			JavascriptExecutor js1 =(JavascriptExecutor)e;
			js1.executeScript("window.scroll(0,15)", "");
			e.navigate().refresh();
			System.out.println("Order placed");
			Thread.sleep(3000);
			e.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
			Thread.sleep(6000);
			
			WebElement lis = e.findElement(By.id("hmenu-content"));
			Select tb = new Select(lis);
			tb.selectByIndex(35);
			WebElement option = tb.getFirstSelectedOption();
			System.out.println(option.isDisplayed());
			Thread.sleep(3000);
			option.click();
			Thread.sleep(3000);
			//e.findElement(By.id("ap_email")).sendKeys("9095133370");
			
			

			
		}	
			
		}

