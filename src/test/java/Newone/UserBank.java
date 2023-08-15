package Newone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class UserBank {
	@Test
	public  void main() throws InterruptedException {
		WebDriver u = new FirefoxDriver();
		u.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		Thread.sleep(3000);
		u.findElement(By.xpath("//button[@ng-click='customer()']")).click();
		Thread.sleep(2000);
		WebElement user =u.findElement(By.xpath("//select[@name='userSelect']"));
		Select select = new Select(user);
		select.selectByValue("3");
		WebElement d =select.getFirstSelectedOption();
		System.out.println(d.getText());
		Thread.sleep(2000);
		u.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(2000);
		u.findElement(By.cssSelector("button[ng-class='btnClass2']")).click();
		Thread.sleep(2000);
		u.findElement(By.cssSelector("input[ng-model='amount']")).sendKeys("4000");
		u.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(3000);
		u.findElement(By.cssSelector("button[ng-class='btnClass1']")).click();
		Thread.sleep(2000);
		WebElement table = u.findElement(By.cssSelector("table[class='table table-bordered table-striped']"));
		List<WebElement> trow = table.findElements(By.tagName("tr"));
		WebElement tr = trow.get(1);
		System.out.println(tr.getText());
		List<WebElement> tcol = tr.findElements(By.tagName("td"));
		for (WebElement opt : tcol) {
			System.out.println(opt.getText());
			
		}
		
			
		}
		
		

	}


