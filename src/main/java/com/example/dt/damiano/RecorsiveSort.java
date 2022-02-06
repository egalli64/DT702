package com.example.dt.damiano;

public class RecorsiveSort {

	public static int[] sort(int[] a, int dim) {
		int d = a.length;
		int m = a[a.length / 2];

		do {
			d = d / 2;
			sortRecorsive(a, m, d);
		} while (d > 1);

		return a;

	}

	public static void sortRecorsive(int[] a, int medium, int dim) {
		int buffer = 0;

		for (int val : a) {
			if (val >= medium) {
				buffer = val;
				val = medium;
				//medium = buffer;
			}
		}
	}

	public static void main(String[] args) {

		// int[] a = new int[5];
		int[] a = { 4, 5, 3, 2 };
		int[] b;

		b = sort(a, a.length);

		for (int val : b) {
			System.out.println(val);
		}

	}
}
