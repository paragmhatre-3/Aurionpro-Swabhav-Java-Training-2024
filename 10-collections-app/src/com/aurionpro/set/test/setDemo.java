package com.aurionpro.set.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class setDemo {

	public static void main(String[] args) {
//		Set<String> hashSet = new HashSet<String>();
//		
//		hashSet.add("The");
//		hashSet.add("World");
//		hashSet.add("Is");
//		hashSet.add("Beautiful!");
//		
//		System.out.println("Hash Set 1:");
//		System.out.println(hashSet);
		
//		Set<String> hashSet2 = new HashSet<String>();
//		
//		hashSet2.add("And");
//		hashSet2.add("Magical");
//		
//		System.out.println("Hash Set2:");
//		System.out.println(hashSet2);
//		
//		hashSet.addAll(hashSet2);
//		
//		System.out.println(hashSet);
		
		LinkedHashSet<String> linkedSet = new LinkedHashSet<String>();
		
		linkedSet.add("The");
		linkedSet.add("World");
		linkedSet.add("Is");
		linkedSet.add("Beautiful");
		System.out.println("Linked Set 1:");
		System.out.println(linkedSet);
		
		LinkedHashSet<String> linkedSet2 = new LinkedHashSet<String>();
		
		linkedSet2.add("And");
		linkedSet2.add("Magical");
		
		System.out.println("Linked Set 2:");
		System.out.println(linkedSet);
		
		linkedSet.addAll(linkedSet2);
		System.out.println(linkedSet);
		
		System.out.println(linkedSet.equals(linkedSet2));
		
		
	}

}
