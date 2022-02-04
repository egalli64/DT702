package com.example.dt.damiano.m10.s15.simple;

import java.util.ArrayList;
import java.util.List;

import com.example.dt.damiano.m10.s15.Exercise;

//import com.example.jse.m10.s15.Exercise;

public class MainExercise extends Exercise {

	public static void main(String[] args) {
		// int[] mix = { 5, 7, 3, 9, 8 };
		int[] mix = { 5, 4, 6, 7, 8, 8, 8 };
		int[] p = new int[mix.length];
		List<Integer> al = new ArrayList<Integer>();
		List<Integer> hl = new ArrayList<Integer>();
		Exercise e = new Exercise();

		System.out.println("Valor pari (tramite Array):");

		p = e.valoriPari(mix);

		for (int pari : p) {
			System.out.println(pari);
		}

		al = e.evens(mix);

		System.out.println("Valor pari (tramite ArrayList):");

		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

		hl = e.singles(mix);

		System.out.println("Valor non duplicati (tramite HashSet):");

		for (int i = 0; i < hl.size(); i++) {
			System.out.println(hl.get(i));
		}

	}

}
