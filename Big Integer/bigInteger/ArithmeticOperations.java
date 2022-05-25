package bigInteger;
import java.math.*;
import java.util.Scanner;

public class ArithmeticOperations {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Big Integer 1: ");
		BigInteger n1=sc.nextBigInteger();
		System.out.print("Enter Big Integer 2: ");
		BigInteger n2=sc.nextBigInteger();
		
		System.out.println("Addition: "+(n1.add(n2)));
		System.out.println("Substraction: "+(n1.subtract(n2)));
		System.out.println("Multiplication: "+(n1.multiply(n2)));
		System.out.println("Division: "+(n1.divide(n2)));
		System.out.println("Modulus: "+(n1.remainder(n2)));
		sc.close();
	}

}
