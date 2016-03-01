package generic;

import java.util.Scanner;

public class PalWithMethod {
	public static void main(String[] args) {
		System.out.println("Enter String");
		Scanner StringName = new Scanner(System.in);
		String name = StringName.nextLine();
		GenericUtil.palWithMethod(name);
	}

}
