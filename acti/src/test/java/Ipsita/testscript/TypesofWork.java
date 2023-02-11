package Ipsita.testscript;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Ipsita.genericlib.BaseClass;
@Listeners(Ipsita.genericlib.ListenerImplementation.class)


public class TypesofWork extends BaseClass {
	@Test
   public void alerthandle() 
   {
		driver.findElement(By.cssSelector(".popup_menu_button_settings")).click();
		driver.findElement(By.linkText("Types of Wor")).click();
		driver.findElement(By.className("roundedBoxTag")).click();
		driver.findElement(By.id("name")).sendKeys("rusty");
		driver.findElement(By.cssSelector("[name='active']")).click();
		driver.findElement(By.xpath("//option[text()='archived']")).click();
		driver.findElement(By.cssSelector("#billingType_setBillable")).click();
		driver.findElement(By.cssSelector("[value='      Cancel      ']")).click();
		System.out.println(cu.Alertmsg(driver));
		cu.Alertok(driver);
	}

}
