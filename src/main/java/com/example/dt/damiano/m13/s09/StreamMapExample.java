package com.example.dt.damiano.m13.s09;

//package com.example.jse.m13.s09;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class StreamMapExample {
	public static void main(String[] args) {
		List<Dog> dogs = List.of(new Dog("Red", "Robert Redford"), new Dog("Zip", "Val Kilmer"),
				new Dog("Fido", "Andrew Scott"));
		System.out.println("Dogs are: " + dogs);

		System.out.println("Dog owners");
		dogs.stream().map(Dog::getOwner).forEach(System.out::println);

		System.out.println("Sorted owner name lengths");
		dogs.stream().map(dog -> dog.getOwner().length()).sorted(Comparator.reverseOrder())
				.forEach(System.out::println);

		System.out.print("Owners characters, lower case, no duplicates >");
		dogs.stream().map(Dog::getOwner).map(s -> s.split("")).flatMap(Arrays::stream).map(String::toLowerCase)
				.distinct().sorted().forEach(System.out::print);
		System.out.println('<');

		Set<Character> letters = new TreeSet<>();
		for (Dog dog : dogs) {
			for (char c : dog.getOwner().toCharArray()) {
				letters.add(Character.toLowerCase(c));
			}
		}
		System.out.println("Owners characters, lower case, no duplicates >");
		for (char c : letters) {
			System.out.println(c);
		}
		System.out.println("< (version 2) >");

		for (Dog dog : dogs) {
			System.out.println(dog.getOwner().toLowerCase());
		}
		
		System.out.println("< (version 3) >");

	}

}