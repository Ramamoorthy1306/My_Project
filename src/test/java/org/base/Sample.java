package org.base;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Sample  extends BaseClass{
	
	public static void main(String[] args) throws IOException  {
		
	 browser();
	passUrl("https://adactinhotelapp.com/");
	toMax();
	
	//page1
	PojoClassP1 p= new PojoClassP1();
	fillInput(p.getUsername(), excelRead(1,7));
	fillInput(p.getPass(), excelRead(1, 5));
	toclick(p.getLogin());
    
    //page2
    PojoPage2 r=new PojoPage2();
    impWait();
	dropDown(r.getElement3());
	byValue("Paris");
	dropDown(r.getElement4());
	byIndex(2);
	dropDown(r.getElement5());
	byIndex(4);
	dropDown(r.getElement6());
	byValue("2");
	WebElement element7 = r.getElement7();
	element7.clear();
	fillInput(element7, "10/06/2025");
	WebElement element8 = r.getElement8();
	element8.clear();
	fillInput(element8, "13/06/2025");
	dropDown(r.getElement9());
	byValue("2");
	dropDown(r.getElement01());
	byValue("2");
	toclick(r.getsubmit());

	//page3
	PojoPage3 y=new PojoPage3();
	toclick(y.getElement02());
	toclick(y.getElement03());
    fillInput(y.getElement04(), excelRead(1, 0));
	fillInput(y.getElement05(), excelRead(1, 0));
    fillInput(y.getElement06(), excelRead(1, 2));
	fillInput(y.getElement07(), "9632587412365489");;
    dropDown(y.getElement08());
	byValue("VISA");
    dropDown(y.getElement09());
	byValue("11");
	dropDown(y.getElement00());
	byValue("2025");
	fillInput(y.getElement001(), "562");
	toclick(y.getElement002());
	impWait();
    getAttribute(y.getFindelement2());
	 }
	}


 