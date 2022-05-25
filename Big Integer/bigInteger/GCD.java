package bigInteger;

import java.math.*;
import java.util.Scanner;
public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number 1: ");
		BigInteger n1=sc.nextBigInteger();
		System.out.print("Enter number2: ");
		BigInteger n2=sc.nextBigInteger();
		System.out.println("GCD of "+n1+" and "+n2+" : "+n1.gcd(n2));
		System.out.println("LCM of "+n1+" and "+n2+" : "+((n1.multiply(n2).divide(n1.gcd(n2)))));
		sc.close();
	}

}
