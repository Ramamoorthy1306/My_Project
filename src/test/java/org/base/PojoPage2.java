package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class PojoPage2 extends BaseClass {
	
	public PojoPage2() {
		PageFactory.initElements(driver,this);
	}
	
	 
	
	 @FindBy(id="location")
	 private WebElement element3;
	 
	 @FindBy(id="hotels")
	 private WebElement element4; 
	 
	 @FindBy(id="room_type")
	 private WebElement element5;
	 
	 public WebElement getElement3() {
		return element3;
	}


	public WebElement getElement4() {
		return element4;
	}


	public WebElement getElement5() {
		return element5;
	}


	public WebElement getElement6() {
		return element6;
	}


	public WebElement getElement7() {
		return element7;
	}


	public WebElement getElement8() {
		return element8;
	}


	public WebElement getElement9() {
		return element9;
	}


	public WebElement getElement01() {
		return element01;
	}


	public WebElement getsubmit() {
		return submit;
	}


	@FindBy(id="room_nos")
	 private WebElement element6;
	 
	 @FindBy(name="datepick_in")
	 private WebElement element7;
	 
	 
	@FindAll({ 
	 
		@FindBy(xpath="(//input[@type='text'])[3]")
	
	})
	 private WebElement element8;
	 
	 
	 
	 @FindBy(id="adult_room")
	 private WebElement element9;
	 
	 
	 @FindBy(id="child_room")
	 private WebElement element01;

	 
	 @FindBy(id="Submit")
	 private WebElement submit;

}
