package com.aurionpro.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StringTest {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Bhakti", "Parag", "Shubham", "Priyansh", "Joey");

		names.stream()
		.sorted()
		.limit(3)
		.forEach((name) -> System.out.println(name));
		System.out.println("___________________________________________________________");

		names.stream()
		.sorted(Comparator.reverseOrder())
		.limit(3)
		.forEach((name) -> System.out.println(name));
		System.out.println("___________________________________________________________");

		names.stream()
		.sorted()
		.filter(name -> name.contains("a"))
		.limit(3).forEach((name) -> System.out.println(name));
		System.out.println("___________________________________________________________");

		names.stream()
		.sorted()
		.map(name -> name.substring(0, 3))
		.limit(3)
		.forEach((name) -> System.out.println(name));
		System.out.println("___________________________________________________________");
		
		names.stream()
		.sorted()
		.filter(name -> (name.length() <= 4))
		.forEach((name) -> System.out.println(name));
		System.out.println("___________________________________________________________");

	}

}
