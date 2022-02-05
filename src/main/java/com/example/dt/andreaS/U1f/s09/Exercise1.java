package com.example.dt.andreaS.U1f.s09;

import java.util.Arrays;
import org.apache.commons.lang3.StringUtils;

public class Exercise1 {
	public static void main(String[] args) {

		/*
		 * SETTINGS: to verify if the input is out of bound select Run Properties an
		 * insert as argument a number : - less than 10 okay - greater than 10 -->
		 * Warning
		 */
		System.out.println("This is a test with ARRAYS.");

		int[] numericalArray = new int[10]; // 10 is the length
		for (int i = 0; i < numericalArray.length; i++) {
			numericalArray[i] = i;
		}
		
		System.out.println(Arrays.toString(numericalArray));
		numericalArray[5] = 12000;
		System.out.println(Arrays.toString(numericalArray));
		System.out.println(StringUtils.isNumeric(args[0]));
        //int modifiedArgs = Integer.parseInt(args[0]);
		if (!StringUtils.isNumeric(args[0]) || (Integer.parseInt(args[0]) >= 10 && args.length<=1) ) {
			System.out.println("WARNING: - Out of bound or Too much argument or Is not numeric");
			System.out.println(Arrays.toString(args));

		} else if (args.length > 1) {
			System.out.println("Array elements are accessible by 1 numerical index only. Please chose another input.");
		} else {
			System.out.println("The element with index: " + args[0] + " is: " + numericalArray[Integer.parseInt(args[0])]);
		}

	}

}
