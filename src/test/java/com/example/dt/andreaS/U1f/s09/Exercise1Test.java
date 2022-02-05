package com.example.dt.andreaS.U1f.s09;

import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Exercise1Test {

	ArrayReturn test = new ArrayReturn();
	int[] arrayTest = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

	@Test
	void outOfBoundTest() {

		String[] argsTest = { "10" };

		String expected = "WARNING: - Out of bound or Too much argument or Is not numeric";
		String value = test.returnByStringIndex(argsTest, arrayTest);

		assertTrue(expected.equals(value));
	}
	
	@Test
	void isNotNumericTest() {

		String[] argsTest = { "ti" };

		String expected = "WARNING: - Out of bound or Too much argument or Is not numeric";
		String value = test.returnByStringIndex(argsTest, arrayTest);

		assertTrue(expected.equals(value));
	}
	
	@Test
	void tooMuchArgumentTest() {

		String[] argsTest = { "10 3","ciao" };

		String expected = "WARNING: - Out of bound or Too much argument or Is not numeric";
		String value = test.returnByStringIndex(argsTest, arrayTest);

		assertTrue(expected.equals(value));
	}
	
	@Test
	void correctTest() {

		String[] argsTest = { "5" };

		//String expected = ("The element with index: " + argsTest[0] + " is: " + arrayTest[Integer.parseInt(argsTest[0])]);
		String expected = "The element with index: 5 is: 5";
		String value = test.returnByStringIndex(argsTest, arrayTest);
		System.out.println(test.returnByStringIndex(argsTest, arrayTest));

		assertTrue(expected.equals(value));
	}
	
	

}
