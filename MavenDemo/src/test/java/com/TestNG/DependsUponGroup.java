package com.TestNG;

import org.testng.annotations.Test;

public class DependsUponGroup {
	@Test(groups={"Smoke","Regression testing"})
	public void testcase1() {
		System.out.println("Test case 1");
	}
	@Test(groups={"Smoke","Sanity"})
	public void testcase2() {
		System.out.println("Test case 2");
	}
	@Test(groups={"Functional Testing","Retesting"})
	public void testcase3() {
		System.out.println("Test case 3");

}
}