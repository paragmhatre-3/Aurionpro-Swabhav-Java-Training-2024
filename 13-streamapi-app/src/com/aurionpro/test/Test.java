package com.aurionpro.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(10, 66, 44, 88, 22, 34, 3444, 5667, 898989);
		// Stream<Integer> numberStream = numbers.stream();
		// numberStream.forEach((number) -> System.out.println(number));
		// numbers.stream()
		// .forEach((number) -> System.out.println(number));

		List<Integer> oddNumbers = numbers.stream().filter((number) -> (number % 2 != 0))
				.filter((number) -> (number > 35)).collect(Collectors.toList());

		oddNumbers.forEach((number) -> System.out.println(number));

		System.out.println("___________________________________________________________");

		List<Integer> squaredNumbers = numbers.stream().map((number) -> (number * number)).collect(Collectors.toList());

		squaredNumbers.stream().forEach(((number) -> System.out.println(number)));

		System.out.println("___________________________________________________________");

		int sum = numbers.stream().reduce(0, (number1, number2) -> (number1 + number2));
		System.out.println("SUM Is:" + sum);

		System.out.println("___________________________________________________________");
		
		numbers.stream()
				.sorted()
				.forEach((number)->System.out.println(number));
		
		System.out.println("___________________________________________________________");

		numbers.stream()
		.sorted(Comparator.reverseOrder())
		.forEach((number)->System.out.println(number));
		
		System.out.println("___________________________________________________________");

		numbers.stream()
		.sorted(Comparator.reverseOrder())
		.limit(3)
		.forEach((number)->System.out.println(number));
		
		System.out.println("___________________________________________________________");

		Optional<Integer> maximumNumber = numbers.stream().max((number1,number2)->number1-number2);
		if(maximumNumber.isPresent())
			System.out.println("Maximum Element Is:"+maximumNumber);
		
		System.out.println("___________________________________________________________");

		Optional<Integer> minimumNumber = numbers.stream()
				.min((number1,number2)->number1-number2);
			if(minimumNumber.isPresent())
			System.out.println("Minimum Element Is:"+minimumNumber);
		
		System.out.println("___________________________________________________________");

		
	}

}
