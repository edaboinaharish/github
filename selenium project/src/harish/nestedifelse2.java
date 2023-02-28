package harish;

import java.util.Scanner;

public class nestedifelse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner SC=new Scanner(System.in);
		System.out.println("enter salary");
		int sal=SC.nextInt();
		char grade;
		if(sal<20000)
		{
			grade='c';
		}
		else if (sal>=20000&&sal<=40000)
		{
			grade='b';
		}
		else
		{
			grade='a';
		}
		System.out.println("grade for the given salary is:"+grade);
		
		}

	}


