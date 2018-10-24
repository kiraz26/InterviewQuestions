package javaquestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueValueFromString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter input:");
		String inStr = input.nextLine();
		uniqueValue(inStr);

	}

	public static void uniqueValue(String str) {
		String[] arr = str.split("");
		//String unique = "";
		Set<String> unique = new LinkedHashSet<String>(Arrays.asList(arr));
		//String[] uq = temp.toArray(new String[temp.size()]);
		/*for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] != arr[j]) {
					unique=""+arr[i];

				}
			}
		}*/
		//System.out.println(Arrays.toString(uq));

	}

}
