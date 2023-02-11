package Ipsita.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Ipsita.genericlib.BaseClass;
import Ipsita.genericlib.CommonUtility;

public class dropdownTest extends BaseClass {
	CommonUtility cu=new CommonUtility();
	@Test(groups= {"smoke"})
	public void DropDown() throws IOException 
	{
		driver.findElement(By.xpath("//div[@class='menuTable']/div[2]")).click();
		driver.findElement(By.xpath("//li[@id='popup_menu_item_1']/../li[4]/a")).click();
	    WebElement dropdown= driver.findElement(By.id("firstHierarchyLevelCodeSelect"));
	    dropdown.click();
	    cu.getSelectByVisibleText(dropdown,"Product Line");
	}
	    public void Screenshot() throws IOException
	    {
	    WebElement logo=driver.findElement(By.id("FormModifiedTextCell"));
        cu.getScreenShotAs(logo);
	    }



}
