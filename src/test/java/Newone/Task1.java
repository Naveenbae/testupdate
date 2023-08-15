package Newone;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Task1 {
	@Test

	public  void Scrollbar() throws IOException, InterruptedException {
		WebDriver b = new FirefoxDriver();
		b.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		b.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		boolean win = false;
		b.findElement(By.id("newWindowBtn")).click();
		if(win!=false) {
			System.out.println("Window is not  open");
		}else {
				System.out.println("Window is opened");
		}
	Set<String> wh = b.getWindowHandles();
		ArrayList h = new ArrayList(wh);
		b.switchTo().window((String)h.get(1));
		b.manage().window().maximize();
		b.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(2000);
		//WebElement ele =b.findElement(By.xpath("(//h2[@class='title'])[7]"));
		//JavascriptExecutor s =(JavascriptExecutor)b;
		//s.executeScript("arguments[0].scrollIntoView(true)",ele);
		b.findElement(By.id("firstName")).sendKeys("Navi");
		b.findElement(By.id("lastName")).sendKeys("police");
		b.findElement(By.id("malerb")).click();
		b.findElement(By.id("englishchbx")).click();
		b.findElement(By.id("frenchchbx")).click();
		b.findElement(By.id("email")).sendKeys("n@gmail.com");
		b.findElement(By.id("password")).sendKeys("n@gmail");
		b.findElement(By.id("registerbtn")).click();
		b.close();
		b.switchTo().window((String)h.get(0));
		b.close();
		

	}

}
