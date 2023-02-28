package javapractice;

import java.util.Scanner;

public class Addition {
	
public static void main(String[]args)
{
	Scanner SC=new Scanner(System.in);
	System.out.println("enter number 1");
	int n1=SC.nextInt();
	System.out.println("enter number 2");
	int n2=SC.nextInt();
	int res=n1/n2;
	System.out.println("the division of"+n1+"with"+n2+"is"+res);
			
}
}
