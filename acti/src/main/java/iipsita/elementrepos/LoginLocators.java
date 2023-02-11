package iipsita.elementrepos;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Ipsita.genericlib.dataUtility;

public class LoginLocators {
	public LoginLocators(WebDriver driver)
	{
		PageFactory.initElements( driver,this);//use "this" for call the findBY()or findBYS()
	}

	 
	 //login
	 
	@FindBy(xpath="//input[@id='username']")
 private WebElement username;
	@FindBy(name="pwd")
 private WebElement passward;
	@FindBy(xpath="//div[text()='Login ']")
 private WebElement loginButton;
	
	
	//generalSetting
	
	@FindBy(xpath="//div[@class='menuTable']/div[2]")
	private WebElement setting ;
	@FindBy(xpath="//li[@id='popup_menu_item_1']/../li[4]/a")
	private WebElement generalSetting ;
	@FindBy(id="firstHierarchyLevelCodeSelect")
	private WebElement customerDropDown ;
	


	
	
 
 
 
public WebElement getSetting() {
		return setting;
	}
public WebElement getGeneralSetting() {
		return generalSetting;
	}
	public WebElement getCustomerDropDown() {
		return customerDropDown;
	}
public WebElement getUsername() {
	return username;
}
public WebElement getPassward() {
	return passward;
}
public WebElement getLoginButton() {
	return loginButton;
}
public void loginapp() throws IOException {
dataUtility du=new dataUtility();
	getUsername().sendKeys(du.getDataFromProperties("username"));
	getPassward().sendKeys(du.getDataFromProperties("psw"));
	getLoginButton().click();
	
}
public void  SelectProductLine()
{
	getSetting().click();
	getGeneralSetting().click();
	getCustomerDropDown().click();
	
	
	}

}
