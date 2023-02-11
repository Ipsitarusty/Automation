package Ipsita.testscript;

import java.io.IOException;
import java.time.Duration;
import java.util.Random;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.poifs.crypt.agile.DataIntegrity;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Ipsita.genericlib.BaseClass;
import Ipsita.genericlib.dataUtility;

public class customerCreation extends BaseClass
{
	@Test
	public void customercreat() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		
		
		int num = cu.getRandomNum(1000000000);
		String actualrname= du.getDataFromExcelSheet("Sheet1", 0, 1);
		actualrname=actualrname+num;
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.cssSelector(".title.ellipsis")).click();
		driver.findElement(By.className("createNewCustomer")).click();
		driver.findElement(By.className("newNameField")).sendKeys(actualrname);
		driver.findElement(By.xpath("//div[text() = 'Create Customer']")).click();
		cu.presencwait(driver, actualrname, By.xpath("//div[@class='titleEditButtonContainer']"));		
		String ExpCustomername = driver.findElement(By.xpath("//div[@class = 'titleEditButtonContainer']/div[1]")).getText();
		System.out.println(ExpCustomername);
		cu.validation(actualrname, ExpCustomername);
		
				
		

	}


}


