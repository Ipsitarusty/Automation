package Ipsita.testscript;

import org.testng.annotations.Test;

import Ipsita.genericlib.BaseClass;

public class FetchTitle extends BaseClass {

	@Test
	public void title()
	{
		cu.titlewait("Enter Time-Track", driver);
		//System.out.println(driver.getTitle());
		String actualTitle = "actiTIME - Enter Time-Track";
		String expectedTitle = driver.getTitle();
		cu.validation(actualTitle, expectedTitle);
		
	}
	


}
