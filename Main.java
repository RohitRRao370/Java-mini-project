import java.util.*;
import java.lang.*;

public class Main{

	static String calculator() {
			double a, b, result;
			System.out.println("Enter two numbers:");
			Scanner inp = new Scanner(System.in);
			a = inp.nextDouble();
			b = inp.nextDouble();

			System.out.println("Enter operator:");
			inp.nextLine();
			String op = inp.nextLine();

			if(op.equals("+")) {
				System.out.println(a + b);
				result = a + b;
			} else if (op.equals("-")) {
				System.out.println(a - b);
				result = a - b;
			} else if (op.equals("*")) {
				System.out.println(a * b);
				result = a * b;
			} else if (op.equals("/")) {
				System.out.println(a / b);
				result = a / b;
			} else {
				System.out.println("Invalid operation!");
				return "";
			}
			return String.format ("%f %s %f = %f\n", a, op, b, result);
	}

	static String matCalc() {
		return "";
	}

	public static void main(String[] args) {
		String history = "";
		Scanner inp = new Scanner(System.in);
		while(true) {
			System.out.println(
					"Enter \"h\" for history," +
					"\"m\" for maths operation," +
					"\"mat\" for matrix operation," +
					"\"x\" to exit."
					);
			String operation = inp.nextLine();
			if (operation.equals("h")) {
				if (history.equals("")) {
					System.out.println("Nothing calculated!");
				} else {
					System.out.println(history);
				}
			} else if (operation.equals("m")) {
				history += calculator();
			} else if (operation.equals("mat")) {
				matCalc();
			} else if (operation.equals("x")) {
				break;
			} else {
				System.out.println("Invalid operation!");
			}
		}
		inp.close();
	}
}


