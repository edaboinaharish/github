package javapractice;

import java.util.Scanner;

public class palindrome 
{

	public static void main(String[] args) 
	{
		Scanner SC=new Scanner(System.in);
		System.out.println("enter the number");
		String reverse="";
		String num=SC.nextLine();
		int Length=num.length();
		for(int i= Length-1; i>=0;i--)
			reverse=reverse+num.charAt(i);
		if(num.equals(reverse))
		System.out.println("entered number"+num+" is a palindrome");
		else
			System.out.println("enterd number"+num+" is not a palindrome");
			

	}

}
