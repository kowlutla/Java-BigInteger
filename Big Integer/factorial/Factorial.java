package factorial;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		int n=sc.nextInt();
		System.out.println(fact(n));
		sc.close();
	}
	
	private static BigInteger fact(int n) {
		BigInteger fac=new BigInteger("1");
		for(int i=1;i<=n;i++)
		{
			fac=fac.multiply(new BigInteger(i+""));
		}
		return fac;
		
		
	}

}
