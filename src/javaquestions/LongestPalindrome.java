package javaquestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestPalindrome {

	public static void main(String[] args) {
		String str = "My mom and my dad go to buy civic racecar";
		longestPalindrome(str);

	}

	public static void longestPalindrome(String str) {
		List<String> list1 = new ArrayList<>();
		String[] array = str.split(" ");
		String reversed = "";
		// put array elements into arraylist

		for (int i = 0; i < array.length; i++) {

			list1.add(array[i]);
		}
		System.out.println(list1.toString());

		List<String> list2 = new ArrayList<>();
		for (String string : list1) {
			reversed = "";
			for (int i = string.length() - 1; i >= 0; i--) {

				reversed += string.charAt(i);
			}
			list2.add(reversed);
		}
		System.out.println(list2.toString());

		List<String> list3 = new ArrayList<>();
		for (int i = 0; i < list1.size(); i++) {
			if (list1.get(i).equalsIgnoreCase(list2.get(i))) {
				list3.add(list1.get(i));
			}

		}

		System.out.println(list1.toString());

		System.out.println("Palindromes are " + list3.toString());

		int largestString = 0;
		int index = 0 ;

		for (int i = 0; i < list3.size(); i++) {
			if (list3.get(i).length() > largestString) {
				largestString = list3.get(i).length();
				index++;
			}
		}
		System.out.println("Longest palindrome is " + list3.get(index));

	}
}
