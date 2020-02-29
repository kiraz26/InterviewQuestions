package javaquestions;

public class ArmstrongNumbers {

	public static void isArmstrongNumber(int num) {
		// 153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
		System.out.print(num);

		int cube = 0;
		int remain;
		int temp;

		temp = num;

		while (num > 0) {
			remain = num % 10;
			num = num / 10;
			cube = cube + (remain * remain * remain);

		}

		if (cube == temp) {
			System.out.println(" is Armstrong Number");
		} else {
			System.out.println(" is not Armstrong Number");
		}

	}

	public static void main(String[] args) {

		isArmstrongNumber(153);
		isArmstrongNumber(1553);
		isArmstrongNumber(407);

	}

}
