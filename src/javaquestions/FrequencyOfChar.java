package javaquestions;

public class FrequencyOfChar {

	/*
	 * String -- Frequency of Characters Write a return method that can find the
	 * frequency of characters
	 * 
	 * Ex: FrequencyOfChars("AAABBCDD") ==>> A3B2C1D2 
	 * 
	 */

	public static void main(String[] args) {
		System.out.println(frequencyOfChars());
	}

	public static String frequencyOfChars() {
		String input = "AAABBCDD";

		String nonDuplicate = "";
		/*
		 * This loop finds non-duplicate letters
		 */
		for (int i = 0; i < input.length(); i++) {
			if (!nonDuplicate.contains(input.charAt(i) + "")) {
				nonDuplicate += input.charAt(i) + "";
			}
		}

		/*
		 * This nested loop finds recurring letter's count
		 */
		String expectedResult = "";
		for (int j = 0; j < nonDuplicate.length(); j++) {
			int count = 0;

			for (int i = 0; i < input.length(); i++) {
				if (input.charAt(i) == nonDuplicate.charAt(j)) {
					count++;
				}
			}
			expectedResult += nonDuplicate.charAt(j) + "" + count;
		}
		return expectedResult;
	}
}
