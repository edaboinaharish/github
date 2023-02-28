package javapractice;

import java.util.Scanner;

public class Homework3 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number 1");
		int n1=sc.nextInt();
		System.out.println("enter number 2");
		int n2=sc.nextInt();
		System.out.println("enter choice of operation(+/-)");
		String choice=sc.next();
		int res=0;
		boolean isvalid=true;
		switch(choice)
		{
		case"+":
		 res=n1+n2;
			 break;
		case"-":
		 res=n1-n2;
			 break;
		default:
		 isvalid=false;
			 break;
		}
		if(isvalid=true)
		{
			System.out.println("the arithematic operation of"+n1+"with"+n2+"is"+res);
		}
		else
		{
			System.out.println("invalid choices");
		}

	}

}
