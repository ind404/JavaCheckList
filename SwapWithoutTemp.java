package generic;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 3;
		num1 = num1 * num2;
		num2 = num1 / num2;
		num1 = num1 / num2;
		System.out.println("Num1 is :" + num1);
		System.out.println("Num2 is :" + num2);
	}
}
