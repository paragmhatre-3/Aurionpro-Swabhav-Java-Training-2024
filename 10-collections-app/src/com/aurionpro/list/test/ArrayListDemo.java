package com.aurionpro.list.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		
		List<Integer> numbers = Arrays.asList(10,20,30,40,50);
		
		names.add("Parag");
//		names.add(7);
		names.add("Luffy");
		names.add("Sanji");
		names.add(2, "Zoro");
		names.remove(0);
		
		System.out.println(names.equals(numbers));
		System.out.println(names.isEmpty());
		System.out.println(names);
		System.out.println(names.size());
		System.out.println(names.lastIndexOf("Zoro"));
		
//		System.out.println(names.toString());

	}

}
