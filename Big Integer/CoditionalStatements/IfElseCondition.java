package CoditionalStatements;
import java.math.*;
import java.util.Scanner;

public class IfElseCondition {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		BigInteger n=sc.nextBigInteger();
		if(n.compareTo(new BigInteger("0"))>0)
		{
			System.out.println(n+" is positive");
		}
		else if(n.compareTo(new BigInteger("0"))<0)
		{
			System.out.println(n+" is Negative number");
		}
		else
		{
			System.out.println(n+" is Zero");
		}
		sc.close();
	}

}
