package com.example.dt.damiano.m10.s18;

import java.util.HashSet;

public class Exercise {
	/**
	 * Generate an array that contains only once each value (possibly duplicated) in
	 * the input array
	 * 
	 * <pre>
	 * Example: { 12, 53, 12, 35 } -> { 12, 35, 53 }
	 * 
	 * Note: Result is not expected in any specific order
	 * </pre>
	 * 
	 * @param data an array with duplicates
	 * @return the original array (but wrapped values) stripped of duplicates
	 * 
	 * 
	 */
	@SuppressWarnings("null")
	public Integer[] singles(int[] data) {

		if (data != null || data.length > 0) {

			HashSet<Integer> s = new HashSet<Integer>();
			for (int d : data) {
				s.add(d);
			}
			return s.toArray(new Integer[s.size()]);
		} else {
			throw new NullPointerException("Attenzone: Array vuoto o reference a null");
		}

		// throw new UnsupportedOperationException("Not yet implemented");
	}
}
