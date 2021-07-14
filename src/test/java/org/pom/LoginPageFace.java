package org.pom;

import org.pom.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFace extends BaseClass{
	
	public LoginPageFace() {
		PageFactory.initElements(driver, this);
	}
	@FindBy (id="email")
	private WebElement textUser;
	
	@FindBys ({ 
		@FindBy(id="pass"),
		@FindBy(xpath="//input[@name='pass']")
		
	})
	private WebElement textpass;
	@FindBy (name="login")
	private WebElement cliklgn;
	public WebElement getTextUser() {
		return textUser;
	}
	public WebElement getTextpass() {
		return textpass;
	}
	public WebElement getCliklgn() {
		return cliklgn;
	}
	

}
