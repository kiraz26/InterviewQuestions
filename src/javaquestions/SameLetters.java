package javaquestions;

import java.util.ArrayList;

import java.util.Collections;

import static org.junit.Assert.*;

public class SameLetters {

	/*
	 * String -- Same letters Write a return method that check if a string is build
	 * out of the same letters as another string.
	 * 
	 * Ex: same("abc", "cab"); --> true
	 * 
	 * same("abc", "abb"); --> false
	 */

	public static boolean isSameLetter(String string1, String string2) {
		boolean result = false;
		if (string1.length() != string2.length()) {
			return result;
		}
		ArrayList<String> firstWordLetters = new ArrayList<>();
		for (int i = 0; i < string1.length(); i++) {
			firstWordLetters.add(string1.charAt(i) + "");
		}
		ArrayList<String> secondWordLetters = new ArrayList<>();
		for (int i = 0; i < string2.length(); i++) {
			secondWordLetters.add(string2.charAt(i) + "");
		}

		Collections.sort(firstWordLetters);
		Collections.sort(secondWordLetters);
		for (int i = 0; i < firstWordLetters.size(); i++) {
			if (firstWordLetters.get(i).equals(secondWordLetters.get(i))) {
				result = true;
			} else {
				result = false;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println("Expected: True" + " Actual: " + isSameLetter("abc", "bac"));
		System.out.println("Expected: True" + " Actual: " + isSameLetter("abcd", "badc"));

		System.out.println("Expected: False" + " Actual: " + isSameLetter("abc", "baa"));
		System.out.println("Expected: False" + " Actual: " + isSameLetter("abcc", "bac"));
		System.out.println("Expected: False" + " Actual: " + isSameLetter("abcd", "bacg"));

	}

}
