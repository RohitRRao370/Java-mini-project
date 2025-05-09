import java.util.*;
import java.lang.*;

public class Main{

	String calculator() {
			double a, b;
			System.out.println("Enter two numbers:");
			Scanner inp = new Scanner(System.in);
			a = inp.nextDouble();
			b = inp.nextDouble();

			System.out.println("Enter operator:");
			inp.nextLine();
			op = inp.nextLine();

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
			return String.format ("%lf %s %lf = %lf", a, op, b, result);
	}

	String matCalc() {
		return "";
	}

	public static void main(String[] args) {
		String history = "";
		while(true) {
			System.out.println(
					"Enter \"h\" for history," +
					"\"m\" for maths operation," +
					"\"mat\" for matrix operation," +
					"\"x\" to exit."
					);
			Scanner inp = new Scanner(System.in);
			String operation = inp.nextLine();
			inp.close();
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
	}
}


