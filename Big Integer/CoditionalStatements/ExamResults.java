package CoditionalStatements;
import java.math.*;
import java.util.Scanner;

public class ExamResults {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Marks: ");
		BigInteger marks=sc.nextBigInteger();
		
		if(marks.compareTo(new BigInteger("80"))>=0)
		{
			System.out.println("A Grade");
		}
		else if(marks.compareTo(new BigInteger("70"))>=0)
		{
			System.out.println("B Grade");
		}
		else if(marks.compareTo(new BigInteger("60"))>=0)
		{
			System.out.println("C Grade");
		}
		else if(marks.compareTo(new BigInteger("50"))>=0)
		{
			System.out.println("D Grade");
		}
		else
		{
			System.out.println("Fail");
		}
		
		sc.close();
	}

}
