import java.util.*;
import java.lang.*;

public class Main{

	static String matSub(int matrix1[][], int matrix2[][], int rows, int cols) {
		int matrixToBePrinted[][] = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				matrixToBePrinted[i][j] = matrix1[i][j] - matrix2[i][j];
			}
		}
		String toBeReturned = "";
		for (int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.print(matrixToBePrinted[i][j] + " ");
				toBeReturned += (matrixToBePrinted[i][j] + " ");
			}
			System.out.println("");
			toBeReturned += ("\n");
		}
		return toBeReturned;
	}

	static String matAdd(int matrix1[][], int matrix2[][], int rows, int cols) {
		int matrixToBePrinted[][] = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				matrixToBePrinted[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		String toBeReturned = "";
		for (int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.print(matrixToBePrinted[i][j] + " ");
				toBeReturned += (matrixToBePrinted[i][j] + " ");
			}
			System.out.println("");
			toBeReturned += ("\n");
		}
		return toBeReturned;
	}

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

	static int[][] matRead(int rows, int cols) {
		int matrix[][] = new int [rows][cols];
		
		Scanner inp = new Scanner(System.in);
		System.out.println(
				"Enter matrix in the form\n" +
				"a b c\n" +
				"d e f\n" +
				"For a 2 by 3 matrix, for example"
				);
		String values = "";
		for(int row = 0; row != rows; row++) {
			values = inp.nextLine();
			Scanner valueReader = new Scanner (values);
			for(int col = 0; col != cols; col++) {
				matrix[row][col] = valueReader.nextInt();
			}
			valueReader.close();
		}
		return matrix;
	}

	static String matCalc() {
		System.out.println("Enter dimensions of matrices, rows first(Both matrices need same dimensions).");
		Scanner inp = new Scanner(System.in);
		int rows, cols;
		rows = inp.nextInt();
		cols = inp.nextInt();
		int matrix1[][] = new int [rows][cols];
		matrix1 = matRead(rows, cols);
		int matrix2[][] = new int [rows][cols];
		matrix2 = matRead(rows, cols);
		inp.nextLine();
		System.out.println("Enter operation to be performed:\n" +
				"+" +
				" -"
				);
		String operation = inp.nextLine();
		if(operation.equals("+")) {
			return matAdd(matrix1, matrix2, rows, cols);
		} else if (operation.equals("-")) {
			return matSub(matrix1, matrix2, rows, cols);
		} else {
			System.out.println("Invalid operation!");
		}
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
				history += (calculator());
			} else if (operation.equals("mat")) {
				history += (matCalc());
			} else if (operation.equals("x")) {
				break;
			} else {
				System.out.println("Invalid operation!");
			}
		}
		inp.close();
	}
}


