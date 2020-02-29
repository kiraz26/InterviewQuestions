package javaquestions;

import java.util.HashMap;
import java.util.Iterator;

public class OccurencesOfString {

	public static void main(String[] args) {
		String string = "I am am learning java java";
		occurenceString(string);

		findDuplicateString(string);

	}

	public static void occurenceString(String string) {

		String[] array = string.split(" ");
		HashMap<String, Integer> map = new HashMap<>();

		for (String str : array) {
			if (map.get(str) != null) {
				map.put(str, map.get(str) + 1);
			} else {
				map.put(str, 1);
			}

		}
		System.out.println(map);
	}

	static void findDuplicateString(String string) {

		String[] array = string.split(" ");
		HashMap<String, Integer> map = new HashMap<>();

		
		for (String str : array) {
			if (map.get(str) != null) {
				map.put(str, map.get(str) + 1);
			} else {
				map.put(str, 1);
			}

		}
		
		Iterator<String> iter = map.keySet().iterator();
		
		while(iter.hasNext()) {
			String temp=iter.next();
			if(map.get(temp)>1) {
				System.out.println(temp+" "+map.get(temp)+" times");
			}
			
			
		}
		
		

	}

}
