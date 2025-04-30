package org.base;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;




public class BaseClass{

    public static WebDriver driver ;
     public static  Actions  a ;
	  public static Robot r;
	   public static Alert z;
		public static  JavascriptExecutor j;
		public static List<String> l;
		public static  Select s;
		public static FluentWait<WebDriver> f;
		public static Set<String> w;
		

  public static void browser() {
	    
	  
	  driver= new ChromeDriver();

}		
 public static  void passUrl(String url) {
	 
	 driver.get(url);
	 

}
 
 
 public static void toMax() {
	driver.manage().window().maximize();

}
   public static void currentUrl( ) {
	
	   
	   
	String currentUrl = driver .getCurrentUrl();
System.out.println(currentUrl);
}
 
  public static void fillInput(WebElement element,String text) {
	 
	 element.sendKeys(text);

}
  public static void jScript( ) {
	   j= (JavascriptExecutor)driver;
			
}
 
  public static void jsClick(WebElement element) {
	  j.executeScript("arguments[0].click()", element);
	 
}
  public static void jsInputValue( WebElement element , String text) {
	  j.executeScript("arguments[0].setAttribute('value','"+text+"')", element);
}
  public static void jsReturn(WebElement element) {

	  Object ll = j.executeScript("return arguments[0].getAttribute('value')", element);

	  System.out.println(ll);
}
  public static void getText( WebElement element) {
	 
	  String text = element.getText();
	  
System.out.println(text);

}
  
  public static void toclick( WebElement element) {

	  element.click();
	  
}
  public static void toClose() {
	
	  
	  driver.close();
}
  
  public static void toQuit() {
	driver.quit();

}
  
  public static void getAttribute(WebElement element) {
		
    	
		String attribute = element.getAttribute("value");
    	System.out.println(attribute);
	} 
    public static void mouseClass() {
    	a=new Actions(driver);
	}
  
  public static void  mouseHover( WebElement element) {
	a.moveToElement(element).perform();
}

  public static void dragAndDrop(WebElement source, WebElement target) {

	 a.dragAndDrop(source, target).perform(); ;
	  
}
   
  
  public static void rightCick( WebElement target) {
	
	 a.contextClick(target).perform();

}
  public static void scrollUpDown(WebElement ss) {
 a.clickAndHold(ss).perform();

}
   
  
  public static void mouseClick() {
	 a.click().perform();

}
   
    public static void robotClass() throws AWTException {
		 r=new Robot();

	}
    
    public static  void enter() {
    	r.keyPress(KeyEvent.VK_ENTER);
    	r.keyRelease(KeyEvent.VK_ENTER);


	}
    
    public static void tab() {
    	r.keyPress(KeyEvent.VK_TAB);
    	r.keyRelease(KeyEvent.VK_TAB);

	}
    
     
 public static void copy() {
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_C);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_C);
	
	
}
 
  public static void paste(char text) {
	
	  r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
}
 
  
  public static  void alertTo() {
	
  z = driver.switchTo().alert();
 
}
  
   public static void acceptAlert() {
	z.accept();
}
  
  public  static void cancelAlert() {
	 z.dismiss();

}
  
	public static void screenShot( WebDriver driver, String name) throws IOException {
		TakesScreenshot ss=(TakesScreenshot)driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		Files.copy( source, new File("C:\\Users\\dinesh\\OneDrive\\Desktop\\"+name+".png"));
		
		
	}  
                                               
	public static void indexFrame(int no) {
	 driver.switchTo().frame(no);
}
  
	public static void idFrame( String id) {
	driver.switchTo().frame(id);

}
	public static void webEleFrame(WebElement webelerefname) {
		driver.switchTo().frame(webelerefname);

	}	 
 
	public static  void listobj() {
	 l=new ArrayList<String>();

	}

	public static  void add(String e) {
		l.add(e);          
	}
	
	public static  void dropDown(WebElement element) {
		s=new Select(element);
	}
	
	public static  void byValue( String value) {
	
		s.selectByValue(value);

	}
	
	public static  void byIndex(int index) {
		s.selectByIndex(index);
	}
	
	
	public static  void visibilityText(String text ) {
	s.deSelectByContainsVisibleText(text);
	}
	
	public static void impWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public static void fluentWait() {
		f =new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofMillis(200)).ignoring(Throwable.class);
	}
	
	public static void visiOfEleLocated(String locater) {
		f.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locater)));
	}
	public static void ele2Click(String locater) {
		f.until(ExpectedConditions.elementToBeClickable(By.xpath(locater)));

	}
	 public static void windowHandles() {
       w = driver.getWindowHandles();

       
	}
	 
	public static void addAll() {
		 l.addAll(w);

	}
	
	public static void switchWindow(int indexno) {
		
driver.switchTo().window(l.get(indexno));
	}
	
	public static  String excelRead( int row, int cell) throws IOException {
		 File f= new File("C:\\\\Users\\\\dinesh\\\\eclipse-workspace\\\\BaseClassProject\\\\target\\\\ramamoorthy details.xlsx");
			
			FileInputStream fil= new FileInputStream(f);
			
			Workbook w= new XSSFWorkbook(fil);
			
	              Sheet s = w.getSheet("Sheet1");
	              
	             
	            	   Row r = s.getRow(row);
	            	   
	            	
						Cell c = r.getCell(cell);
						int cellType = c.getCellType();
						  String value;
						
						
						if (cellType==1) {
							
						 value = c.getStringCellValue();
							
						}
						else if (DateUtil.isCellDateFormatted(c)) {
							
							Date d = c.getDateCellValue();
							
							SimpleDateFormat sim=new SimpleDateFormat("dd-MM-yyyy");
							
							 value = sim.format(d);
							
						}
						else {
							double d = c.getNumericCellValue();
							
							long l= (long)d;
							  
						value = String.valueOf(l);
						}
				 return value;
				}
	              

	}
	
	
	
	
	
	
	
	
	

