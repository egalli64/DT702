package com.example.dt.andreaS.U1f.s09;

import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;

public class ArrayReturn {

	public ArrayReturn() {
	}

	public String returnByStringIndex(String[] input, int[] array) {
		if (!StringUtils.isNumeric(input[0]) || Integer.parseInt(input[0]) >= array.length || input.length > 1) {
			System.out.println(Arrays.toString(input));
			return "WARNING: - Out of bound or Too much argument or Is not numeric";

		} else {
			return ("The element with index: " + input[0] + " is: " + array[Integer.parseInt(input[0])]);
		}

	}

}
