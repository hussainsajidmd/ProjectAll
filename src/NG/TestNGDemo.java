package NG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGDemo {
	@Test
	public void print(){
		//If you want to print "let me see" on console, then use s.o.p().
		//If you want to print on both console and report page, then use "true".
		//If you want to print only in report page, then use "false".
		Reporter.log("let me see", true);
	}
}
