package javapractice;

import java.util.Scanner;

public class swichcase 
{

	public static void main(String[] args) 
	{
		Scanner SC=new Scanner(System.in);
		System.out.println("enter number 1");
		int n1=SC.nextInt();
		System.out.println("enter number 2");
		int n2=SC.nextInt();
		System.out.println("enter choice of operation(+/-/*):");
		String choice=SC.next();
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
			case"*":
				res=n1*n2;
				break;
				default:
					isvalid=false;
					break;
		}
		if(isvalid==true)
		{
			System.out.println("the arithametic oparetion '"+choice+"'on"+n1+"with"+n2+" is"+res);
		}
		else
		{
			System.out.println("invalid choice enterd");
		}
		
		

	}

}
