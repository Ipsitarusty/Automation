package Ipsita.genericlib;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import iipsita.elementrepos.LoginLocators;

public class BaseClass 
{

	public WebDriver driver;
	public static WebDriver Listenerdriver;
	
	
	public dataUtility du = new dataUtility();
	public CommonUtility cu = new CommonUtility();
	
	@BeforeClass(alwaysRun=true)
	public void launchBrowser(String browser)
	{
		driver = new ChromeDriver();
		Listenerdriver= driver;
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@BeforeMethod(alwaysRun=true)
	public void login() throws EncryptedDocumentException, IOException
	{
		driver.get(du.getDataFromProperties("url"));
		LoginLocators lo= new LoginLocators(driver);
		lo.loginapp();

		}
	
	@AfterMethod(alwaysRun=true)
	public void logout()
	{
		driver.findElement(By.id("logoutLink")).click();
		
	}
	
	@AfterClass(alwaysRun=true)
	public void closeBrowser()
	{
		driver.close();
	}
	}
