package javapractice;

import java.util.Arrays;
import java.util.Scanner;

public class exarise1 
{

	

	public static void main(String[] args) 
	{
//		declare an array with size 7
		int[]a=new int[7];
//		take element values at runtime
		Scanner SC=new Scanner(System.in);
		for(int i=0; i<a.length; i++)
		{
			System.out.print("enter array value");
			a[i]=SC.nextInt();
		}
//		print the array 
		System.out.print("a=");
		for(int i:a)
		{
			System.out.print(i+" ");
		}
//		sort the array data
		int len=a.length;
		int s;
		for(int i=0; i<len-1;i++)
		{
			for (int j=0;j<len-1;j++)
			{
				if(a[j]>a[j+1])
				{
					s=a[j];
					a[j]=a[j+1];
					a[j+1]=s;
				j ++;	
				}
			}
		
		}
	
             System.out.println("\nthe sorted array is"+Arrays.toString(a));
	}
	
}


