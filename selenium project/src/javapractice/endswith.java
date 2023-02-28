package javapractice;

import java.util.Scanner;

public class endswith 
{

	public static void main(String[] args) 
	{
		Scanner SC=new Scanner(System.in);
		System.out.println("enter email");
		  String email=SC.next();
		if(email.endsWith("@gmail.com")||email.endsWith("@yahoo.com"))
				{
			System.out.println("valid email entered");
				}
		else
		{
			System.out.println("invalid email enterd");
		}

	}

}
