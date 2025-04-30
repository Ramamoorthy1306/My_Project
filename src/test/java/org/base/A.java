package org.base;

import org.testng.Assert;

public class A {	
	
	@org.testng.annotations.Test (priority = 3)
	public void tc1() {
		// TODO Auto-generated method stub
		System.out.println("testcase 1");
	}

	@org.testng.annotations.Test(priority = 1)
	public void tc3() {
		// TODO Auto-generated method stub
		System.out.println("testcase 3");
	}
	
	@org.testng.annotations.Test(priority = 2)
	public void tc2() {
		System.out.println("testcase 2");

	}
	@org.testng.annotations.Test(priority = -1)
	public void tc4() {
		Assert.assertTrue(false);
		System.out.println("testcase 4");
		
	}
		
		@org.testng.annotations.Test(priority = -12)
		public void tc5() {
			System.out.println("testcase 5");
			
		}	
			
		}
