import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int n1 = sc.nextInt();
		
		System.out.print("Enter second number: ");
		int n2 = sc.nextInt();
		
		System.out.print("Enter a math operation (+, -, *, /): ");
		String op = sc.nextLine();
		
		if(op.contains("+")) {
			System.out.println("Result: " + plus(n1, n2));
		} else if(op.contains("-")) {
			System.out.println("Result: " + minus(n1, n2));
		} else if(op.contains("*")) {
			System.out.println("Result: " + multiply(n1, n2));
		} else if(op.contains("/")) {
			System.out.println("Result: " + divide(n1, n2));
		}
		
		sc.close();
	}
	
	public int plus(int n, int m) {
	}
	
	public int minus(int n, int m) {
		return n-m;
	}
	
	public int divide(int n, int m) {
	}
	
	public int multiply(int n, int m) {
		return n * m;
	}
}
