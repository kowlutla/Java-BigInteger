package CoditionalStatements;

import java.math.BigInteger;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year: ");
		BigInteger year=sc.nextBigInteger();
		
		if(year.remainder(new BigInteger("4")).compareTo(new BigInteger("0"))==0 && year.remainder(new BigInteger("100")).compareTo(new BigInteger("0"))!=0 || year.remainder(new BigInteger("400")).compareTo(new BigInteger("0"))==0 )
		{
			System.out.println(year+" is Leap Year ");
		}
		else
		{
			System.out.println(year+ " is not leap year");
		}
		sc.close();
	}

}
