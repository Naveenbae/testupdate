package Newone;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Demosite {
	@Test
	public  void main() throws InterruptedException, IOException {
		WebDriver s = new FirefoxDriver();
		s.get("https://www.saucedemo.com/");
		s.manage().window().maximize();
		s.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		s.findElement(By.id("user-name")).sendKeys("standard_user");
		s.findElement(By.id("password")).sendKeys("secret_sauce");
		s.findElement(By.id("login-button")).click();
		
		//search by using filter
		Thread.sleep(2000);
		WebElement list = s.findElement(By.xpath("//select[@class='product_sort_container']"));
		Select product = new Select(list);
		product.selectByValue("lohi");
//		WebElement hit =product.getFirstSelectedOption();
//		System.out.println(hit.getText());
		
		//select product
		Thread.sleep(5000);
		JavascriptExecutor js =(JavascriptExecutor)s;
		js.executeScript("window.scroll(0,1000)", "");
		Thread.sleep(5000);
		WebElement pr1 = s.findElement(By.xpath("(//div[@class='inventory_item_name'])[6]"));
		pr1.click();
		
		
		//add to cart item
		Thread.sleep(3000);
		JavascriptExecutor js1 =(JavascriptExecutor)s;
		js1.executeScript("window.scroll(0,1000)", "");
		s.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
		Thread.sleep(3000);
		JavascriptExecutor js2 =(JavascriptExecutor)s;
		js2.executeScript("window.scroll(0,20)", "");
		
		
		
		//check out
		Thread.sleep(3000);
		s.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();
		s.findElement(By.id("checkout")).click();
		s.findElement(By.id("first-name")).sendKeys("Karthik");
		s.findElement(By.id("last-name")).sendKeys("Raja");
		s.findElement(By.id("postal-code")).sendKeys("09870");
		s.findElement(By.id("continue")).click();
		Thread.sleep(5000);
		JavascriptExecutor js3 =(JavascriptExecutor)s;
		js3.executeScript("window.scroll(0,1000)", "");
		
		//payment method
		Thread.sleep(5000);
		s.findElement(By.id("finish")).click();
		s.getTitle();
		
		//order page screen shot
		File sc = ((TakesScreenshot)s).getScreenshotAs(OutputType.FILE);
		Files.copy(sc,new File("C:\\Users\\Naveen kumar\\eclipse-workspace\\Testprg\\Snap\\img4.jpeg"));
		Thread.sleep(3000);
		s.findElement(By.id("back-to-products")).click();
		
		//order some other item
		Thread.sleep(2000);
		s.findElement(By.xpath("(//div[@class='inventory_item_name'])[2]")).click();
		Thread.sleep(2000);
		s.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		Thread.sleep(3000);
		s.findElement(By.id("back-to-products")).click();
		Thread.sleep(3000);
		s.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(3000);
		s.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();
		Thread.sleep(2000);
		WebElement prize = s.findElement(By.xpath("(//div[@class='inventory_item_price'])[1]"));
		System.out.println("Prize details of product "+prize.getText());
		WebElement prize2 = s.findElement(By.xpath("(//div[@class='inventory_item_price'])[2]"));
		System.out.println("Prize details of product"+prize2.getText());
		
		System.out.println("Total cost: "+prize.getText()+" " + "  "+prize2.getText());
		Thread.sleep(4000);
		s.findElement(By.id("checkout")).click();
		s.findElement(By.id("first-name")).sendKeys("Karthik");
		s.findElement(By.id("last-name")).sendKeys("Raja");
		s.findElement(By.id("postal-code")).sendKeys("09870");
		s.findElement(By.id("continue")).click();
		Thread.sleep(5000);
		JavascriptExecutor js4 =(JavascriptExecutor)s;
		js4.executeScript("window.scroll(0,1000)", "");
		
		//payment method
		Thread.sleep(5000);
		s.findElement(By.id("finish")).click();
		s.getTitle();
		
		//order page screen shot
		File sc1 = ((TakesScreenshot)s).getScreenshotAs(OutputType.FILE);
		Files.copy(sc1,new File("C:\\Users\\Naveen kumar\\eclipse-workspace\\Testprg\\Snap\\img5.jpeg"));
		Thread.sleep(3000);
		s.findElement(By.id("back-to-products")).click();

	}

}
