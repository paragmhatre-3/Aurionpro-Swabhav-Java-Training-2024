package com.session;

public class StringTest {

	public static void main(String[] args) {
		String name1 = "At";
		String name2 = "At";
		
		//System.out.println(name1.hashCode() == name2.hashCode());
		
		String name3 = "B";
		//System.out.println(name3.hashCode());
		
		name3 = name3 + "M";
		//System.out.println(name3.hashCode());
		
		//System.out.println(name2.hashCode());
		String name4 = new String("Benjamin");
		System.out.println(name4.hashCode());
		name4 = name4 + "Franklin";
		System.out.println(name4.hashCode());
		
		StringBuffer name5 = new StringBuffer("Parag");
		System.out.println(name5.hashCode());
			name5 = name5.append("Mhatre");
		System.out.println(name5.hashCode());
		
		StringBuilder name6 = new StringBuilder("Parag");
		System.out.println(name6.hashCode());
			name6 = name6.append("Mhatre");
		System.out.println(name6.hashCode());
	}

}
