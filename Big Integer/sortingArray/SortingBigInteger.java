/**
 * 
 */
package sortingArray;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author apiiit-rkv
 *
 */
public class SortingBigInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of big numbers: ");
		int n=sc.nextInt();
		BigInteger array[]=new BigInteger[n];
		
		System.out.println("Enter elements into array: ");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextBigInteger();
		}
		
		System.out.println("Original array: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(array[i]+" ");
		}
		
		sort(array,n);
		System.out.println("Array after sorting: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(array[i]+" ");
		}

	}
	
	
	public static void sort(BigInteger[] array,int n)
	{
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(array[j].compareTo(array[j+1])>0)
				{
					BigInteger temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
	}

}
