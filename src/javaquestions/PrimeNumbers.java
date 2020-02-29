package javaquestions;

public class PrimeNumbers {

	public static boolean isPrimeNumber(int n) {
		// Prime numbers start from 2
		// If number less than 2, number cannot be prime number
		if (n <= 1) {
			return false;
		}

		// starts from 2
		for (int i = 2; i < n; i++) {
			// Prime number just can divide itself. Otherwise, it cannot be prime number
			if (n % i == 0) {
				return false;
			}
		}

		return true;

	}

	public static void getPrimeNumbers(int n) {

		for (int i = 2; i <= n; i++) {
			if (isPrimeNumber(i) == true) {
				System.out.print(i + " ");
			}
		}

	}

	public static void main(String[] args) {
		System.out.println("2 is a prime number: " + isPrimeNumber(2));
		System.out.println("3 is a prime number: " + isPrimeNumber(3));
		System.out.println("6 is a prime number: " + isPrimeNumber(6));
		System.out.println("9 is a prime number: " + isPrimeNumber(9));
		System.out.println("13 is a prime number: " + isPrimeNumber(13));
		System.out.println("17 is a prime number: " + isPrimeNumber(17));
		System.out.println("22 is a prime number: " + isPrimeNumber(22));

		getPrimeNumbers(5);
		System.out.println();
		getPrimeNumbers(7);
		System.out.println();
		getPrimeNumbers(10);
		System.out.println();
		getPrimeNumbers(18);

	}

}
