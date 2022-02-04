package com.example.dt.damiano.m10.s18;
//
public class Main extends Exercise {

	public static void main(String[] args) {
		int[] mix = { 5, 4, 6, 7, 8, 8, 8 };
		Integer[] p = new Integer[mix.length];

		Exercise e = new Exercise();
		
		System.out.println("Valori senza duplicati(tramite HashSet):");

		p = e.singles(mix);

		for (int noDupl : p) {
			System.out.println(noDupl);
		}

	}

}
