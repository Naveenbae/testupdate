package Newone;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class windowhandle {
	@Test
	public void main() throws InterruptedException {
		WebDriver d = new FirefoxDriver();
		d.get("https://nxtgenaiacademy.com/multiplewindows/");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement button = d.findElement(By.xpath("(//button[@id='button1'])[3]"));
		button.click();
		System.out.println(d.getCurrentUrl());
		Thread.sleep(5000);
		String hand = d.getWindowHandle();
		d.switchTo().window(hand);
		System.out.println(d.getTitle());
		Thread.sleep(3000);
		WebElement te = d.findElement(By.xpath("(//ul[@class='header-menu clearfix'])[2]/li[3]"));
		te.click();
		
		
	}

}
