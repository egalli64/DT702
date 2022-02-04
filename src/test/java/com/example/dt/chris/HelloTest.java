package com.example.dt.chris;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
    void testMultiplyFor() {
        Hello hello = new Hello();
        int value = 2;
        int multiplier = 2;
        int expected = 4;
        
        int actual = hello.multiplyFor(value, multiplier);
        
        assertEquals(expected, actual);
    }

}
