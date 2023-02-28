package oopsexamples;

import java.util.Scanner;

public class usingmultipleinheritance 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		clsallmethodes obj=new clsallmethodes();
		System.out.println("the sum of 100 and 200 is:"+obj.add(100, 200));
		System.out.println("the substraction of 500 with 200 is:"+obj.substract(500, 200));
		System.out.println("enter string to reverse:");
		String strtorev=sc.nextLine();
		System.out.println("the revesre of "+strtorev+"is:"+obj.strreverse(strtorev));
		System.out.println("enter email:");
		String email=sc.next();
		System.out.println("the id of"+email+"is:"+obj.getid(email));
		

	}

}
