package com.example.dt.andreaS.U1f.s09;

import java.util.Arrays;
//import org.apache.commons.lang3.StringUtils;

public class Exercise1 {
	public static void main(String[] args) {

		/*
		 * SETTINGS: to verify if the input is out of bound select Run Properties an
		 * insert as argument a number : - less than 10 okay - greater than 10 --> Warning
		 * 								 - String no allowed
		 * 
		 */
		System.out.println("This is a test with ARRAYS.");

		int[] array = fillingArray(10);

		printArray(array);
		array[5] = 12000;
		printArray(array);
		
		ArrayReturn utils = new ArrayReturn();
		
		System.out.println(utils.returnByStringIndex(args, array));

	}

	static int[] fillingArray(int value) {
		int[] numericalArray = new int[value]; // value is the length
		for (int i = 0; i < numericalArray.length; i++) {
			numericalArray[i] = i;
		}
		return numericalArray;

	}

	static void printArray(int[] array) {
		System.out.println(Arrays.toString(array));

	}
}

