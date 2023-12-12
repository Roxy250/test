package junitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class Mytest {

	@Test
	public void failureTest() {
		fail("Not yet implemented");//1)run failure
	}
	@Test
	public void errorTest() {
		System.out.println("hello")//2)run error
	}
	
	@Test
	public void normalTest() {
		System.out.println("hello");//3)run success
	}

}
