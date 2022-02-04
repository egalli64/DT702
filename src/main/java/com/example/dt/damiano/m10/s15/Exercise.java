package com.example.dt.damiano.m10.s15;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Exercise {
	/**
	 * Extract from input the even values and return them in an array
	 * 
	 * Do not use Collections in here!
	 * @param data a bunch of integers
	 * @return even values from input
	 * 
	 *         example: in {2, 3, 4, 5} -> out {2, 4}
	 * 
	 *         example: in {2, 2, 4, 6} -> out {2, 2, 4, 6}
	 * 
	 *         example: in {2, 3, 4, 6} -> out {2, 4, 6}
	 */

	@SuppressWarnings("null")
	public int[] valoriPari(int[] a) {

		if (a != null || a.length > 0) {
			int[] swap = new int[a.length];
			int j = 0;
			for (int i = 0; i < a.length; i++) {
				if (a[i] % 2 == 0) {
					swap[j] = a[i];
					j++;
				}
			}
			int[] pari = new int[j];
			for (int i = 0; i < j; i++) {
				pari[i] = swap[i];
			}
			return pari;
		} else {
			throw new NullPointerException("Attenzione: array vuoto o reference nullo");
		}
	}

	/*
	 * public int[] evensRaw(int[] data) { throw new
	 * UnsupportedOperationException("Not yet implemented");
	 * 
	 * 
	 * }
	 */

	/**
	 * Extract from input the even values and return them in a List
	 * 
	 * @param data a bunch of integers
	 * @return even values from input
	 * 
	 *         example: in {2, 3, 4, 5} -> out {2, 4}
	 */
	@SuppressWarnings("null")
	public List<Integer> evens(int[] data) {
		// throw new UnsupportedOperationException("Not yet implemented");
		if (data != null || data.length > 0) {

			List<Integer> pari = new ArrayList<Integer>();

			for (int i = 0; i < data.length; i++) {
				if (data[i] % 2 == 0) {
					pari.add(data[i]);
				}
			}
			return pari;

		} else {
			throw new NullPointerException("Attenzione: array vuoto o reference nullo");
		}
	}

	/**
	 * Extract non-duplicated values in input and return them in a list
	 * 
	 * @param data a bunch of integers
	 * @return only the non-duplicated values from input
	 * 
	 *         example: in {2, 3, 4, 4, 5, 5, 6, 7} -> out {2, 3, 6, 7}
	 */
	@SuppressWarnings("null")
	public List<Integer> singles(int[] data) {
		// throw new UnsupportedOperationException("Not yet implemented");
		if (data != null || data.length > 0) {

			HashSet<Integer> h = new HashSet<Integer>();

			for (int d : data) {
				h.add(d);
			}

			List<Integer> l = new ArrayList<Integer>();
			l.addAll(h);
			return l;

		} else {
			throw new NullPointerException("Attenzione: array vuoto o reference nullo");
		}

	}
}
