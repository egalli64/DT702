package com.example.dt.andreaS.U1f.s04;

public class Exercise1 {
	public static void main(String[] args) {
		System.out.println("This is a test with args.");

		if (args.length == 0) {
			System.out.println("There is no args.");
		} else {
			System.out.print("Args: ");
			for (String item : args) {
				System.out.print(item + " ");
			}
		}
	}

}
