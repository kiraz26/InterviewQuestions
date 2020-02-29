package javaquestions;

public class PalindromeNumbers {

	public static void isPalindromeNumber(int num) {
		System.out.print("Given number " + num);

		int remain;
		int sum = 0;
		int temp;
		temp = num;

		while (num > 0) {
			remain = num % 10;
			sum = (sum * 10) + remain;
			num = num / 10;

		}

		if (temp == sum) {
			System.out.println(" is a Palindrome Number");
		} else {
			System.out.println(" is not a Palindrome Number");
		}

	}

	public static void main(String[] args) {

		isPalindromeNumber(151);
		isPalindromeNumber(1554);
		isPalindromeNumber(11);
		isPalindromeNumber(1545451);
		isPalindromeNumber(151151);
		isPalindromeNumber(33333);
		isPalindromeNumber(3333);
		isPalindromeNumber(3133);
		isPalindromeNumber(3313);

	}

}
