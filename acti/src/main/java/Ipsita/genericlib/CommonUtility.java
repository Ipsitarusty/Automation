package Ipsita.genericlib;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CommonUtility {
	public int getRandomNum(int range)
	{
	Random r=new Random();
	int num=r.nextInt(range);
	return num;
	}
	public void getSelectByVisibleText( WebElement dropdown,String VisibleText)
	{
		Select s=new Select(dropdown);
		s.selectByVisibleText(VisibleText);
	}
	public void titlewait(String title,WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10)) ;
		wait.until(ExpectedConditions.titleContains(title));
		
	}
	public void Alertok(WebDriver driver)
	{
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}
	public String Alertmsg(WebDriver driver)
	{
		Alert alt = driver.switchTo().alert();
		String msg = alt.getText();
	return msg;
		
	}
	public void presencwait(WebDriver driver,String as,By xpath)
	{
 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
 wait.until(ExpectedConditions.textToBePresentInElementLocated(xpath,as));
	}
	
	public void validation(String actual,String expected)
	{
		Assert.assertEquals(actual, expected);
		System.out.println("TC is passed");
	}


}
