package org.base;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

public class PojoClassP1 extends BaseClass {

	public PojoClassP1() {
		
		
		PageFactory.initElements(driver, this);
		
		
	}
	 public WebElement getUsername() {
		return username;
	}


	public WebElement getPass() {
		return pass;
	}


	public WebElement getLogin() {
		return login;
	}
	@FindAll({
		 
		 
		 @FindBy(id="username"),
		 @FindBy(xpath="//input[@name='username']")
		 
		 
		 
		 
	 })
	 private WebElement username;
	 
	 
	 @FindBy(id="password")
	 private WebElement pass;
	 
	 
	 @FindBy(id="login")
	 private WebElement login;
	 
	
	 
	 
		}

