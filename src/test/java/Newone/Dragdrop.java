package Newone;



import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Dragdrop {
@Test
	public  void drag() throws InterruptedException, IOException {
		WebDriver d = new FirefoxDriver();
		Thread.sleep(2000);
		d.get("https://demo.guru99.com/test/drag_drop.html");
		
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement src = d.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement trg = d.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		Actions drop = new Actions(d);
		Thread.sleep(3000);
		drop.dragAndDrop(src, trg).perform();
		WebElement table = d.findElement(By.cssSelector("table[border='0']"));
		WebElement trow = table.findElement(By.tagName("tr"));
		List<WebElement> tcol = trow.findElements(By.tagName("td"));
		for (WebElement list : tcol) {
			System.out.println(list.getText());
			File src1 = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
			Files.copy(src1, new File("C:\\Users\\Naveen kumar\\eclipse-workspace\\Testprg\\Snap\\img1.jpeg"));
			
			
		}
	}

}
