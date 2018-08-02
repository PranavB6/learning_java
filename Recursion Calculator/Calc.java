import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Calc {

	public static void main(String[] args) {

		System.out.println("Program Initialized");

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 5; ++i) {
			
			String expression = scanner.nextLine().replaceAll("\\s", "");		

			Double result = evaluate(expression);

			System.out.println("Result " + result);
		}
		
		scanner.close();

	}

	static int find(String s, char c) {
		int count = 0;

		for (int i = 0; i < s.length(); ++i) {

			if (s.charAt(i) == '(') {
				++count;
			}
			if (s.charAt(i) == ')') {
				--count;
			}
			if (s.charAt(i) == c && count == 0) {
				return i;
			}

		}

		return -1;
	}

	static Double evaluate(String expr) {

		System.out.println("Expression: '" + expr + "'");

		int idx;

		if ((idx = find(expr, '-')) >= 0) {
			return (evaluate(expr.substring(0, idx)) - evaluate(expr.substring(idx + 1)));

		} else if ((idx = find(expr, '+')) >= 0) {
			return (evaluate(expr.substring(0, idx)) + evaluate(expr.substring(idx + 1)));

		} else if ((idx = find(expr, '*')) >= 0) {
			return (evaluate(expr.substring(0, idx)) * evaluate(expr.substring(idx + 1)));

		} else if ((idx = find(expr, '/')) >= 0) {
			return (evaluate(expr.substring(0, idx)) / evaluate(expr.substring(idx + 1)));

		} else if (expr.charAt(0) == '(') {

			if (expr.charAt(expr.length() - 1) == ')') {
				return evaluate(expr.substring(1, expr.length() - 1));
			} else {
				throw new RuntimeException("Brackets missmatch");
			}

		} else {
			return Double.parseDouble(expr);
		}
	}
}