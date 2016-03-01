package generic;

public class GenericUtil {
	public static int factorialOfNumber(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static int factorialWithRecursion(int n) {

		if (n == 0)
			return 1;
		else
			return n * factorialWithRecursion(n - 1);

	}

	public static boolean primeNumber(int n) {
		if (n % 2 == 0) {
			return false;
		}
		for (int i = 3; i * i < n; i++) { // Efficient Algoritam it reduces
											// number of searches.
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static long fibonacciSeries(long n) {
		int a = 0;
		int b = 1;
		int next = 0;
		System.out.println("0");
		System.out.println("1");
		for (int i = 1; i <= n; i++) {
			next = a + b;
			a = b;
			b = next;

			System.out.println(next);

		}

		return next;
	}

	public static int fibRecursion(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fibRecursion(n - 1) + fibRecursion(n - 2);
		}
	}

	public static void palWithoutMethod(String name) {
		int begin = 0;
		int end = name.length() - 1, middle, i;
		middle = (begin + end) / 2;
		for (i = begin; i <= middle; i++) {
			if (name.charAt(begin) == name.charAt(end)) {
				begin++;
				end--;
			} else {
				break;
			}

		}
		if (i == (middle + 1)) {
			System.out.println("The given string is palindrome");
		} else {
			System.out.println("The given string is not palindrome");
		}

	}

	public static void palWithMethod(String name) {
		String reverse = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			reverse = reverse + name.charAt(i);
		}
		if (name.equals(reverse)) {
			System.out.println("The given string is palindrome");
		} else {
			System.out.println("The given string is not palindrome");
		}

	}

}
