package bigInteger;
import java.math.BigInteger;
import java.util.Scanner;

public class InputOutput {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Big Integer: ");
		BigInteger n=sc.nextBigInteger();
		System.out.println("Big Integer is: "+n);
		
		sc.close();
	}

}
