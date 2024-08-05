package com.aurionpro.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
//		Map<String,Integer> map = new TreeMap<String,Integer>();

		map.put("D", 1000);
		map.put("B", 2000);
		map.put("C", 3000);
		map.put("D", 4000);
		System.out.println(map);
		
		map.putIfAbsent("A", 9000);
		System.out.println(map);
		
		Set<Entry<String,Integer>> entries = map.entrySet();
		for(Entry entry:entries)
			System.out.println(entry.getKey() +" - "+ entry.getValue());
		
	}

}
