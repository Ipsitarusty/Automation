package Ipsita.testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import Ipsita.genericlib.BaseClass;
import Ipsita.genericlib.CommonUtility;

public class ActiTimeDropdown extends BaseClass {
	@Test
	public void DropDown() throws IOException
	{
		HomePageLocators hl=new HomePageLocators(driver);
		hl.GotoGeneralSetting();
		DropDownNaming dd=new DropDownNaming(driver);
		dd.SelectProductLine();
    
       CommonUtility cu=new CommonUtility();
       cu.getSelectByVisibleText(dd.getCustomerDropDown(),"Product Line");
	}


}
