package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoPage3 extends BaseClass {

	
	public PojoPage3() {
		  
		PageFactory.initElements(driver, this);
		
		
	}
	 @FindBy(id="radiobutton_0")
	 private WebElement element02;
	 
	 @FindBy(id="continue")
	 private WebElement element03;
	 
	 
	 @FindAll({ 
		 @FindBy(xpath="(//input[@type='text'])[11]")
			
		})
         private WebElement element04;
	 
	 
	 @FindAll({ 
		 
			@FindBy(xpath="(//input[@type='text'])[12]")
		
		}) 
	 private WebElement element05;
	
	 @FindAll({ 
		 
			@FindBy(xpath="//textarea[@id='address']")
		
		}) 
	
	 private WebElement element06;
	 
	 
	 @FindAll({ 
		 
			@FindBy(xpath="(//input[@type='text'])[13]")
		
		})
	
	 private WebElement element07;
	 
	 
	 @FindAll({ 
		 
			@FindBy(xpath="//select[@id='cc_type']")
		
		})
	  private WebElement element08;
	 
	 
	 @FindAll({ 
		 
			@FindBy(xpath="//select[@id='cc_exp_month']")
		
		})
	
	 private WebElement element09;
	 
	 @FindAll({ 
		 
			@FindBy(xpath="//select[@id='cc_exp_year']")
		
		})
	 private WebElement element00;
	
	
	 @FindAll({ 
		 
			@FindBy(xpath="//input[@id='cc_cvv']")
		
		})
	 private WebElement element001;
	 
	 
	 
	 @FindAll({ 
		 
			@FindBy(xpath="(//input[@type='button'])[1]")
		
		})
	 private WebElement element002;
	 
	 
	 @FindAll({ 
		 
			@FindBy(xpath="//input[@id='order_no']")
		
		})
	 private WebElement findelement2;


	public WebElement getElement02() {
		return element02;
	}


	public WebElement getElement03() {
		return element03;
	}


	public WebElement getElement04() {
		return element04;
	}


	public WebElement getElement05() {
		return element05;
	}


	public WebElement getElement06() {
		return element06;
	}


	public WebElement getElement07() {
		return element07;
	}


	public WebElement getElement08() {
		return element08;
	}


	public WebElement getElement09() {
		return element09;
	}


	public WebElement getElement00() {
		return element00;
	}


	public WebElement getElement001() {
		return element001;
	}


	public WebElement getElement002() {
		return element002;
	}


	public WebElement getFindelement2() {
		return findelement2;
	}
	 
	 
	
	 
}


