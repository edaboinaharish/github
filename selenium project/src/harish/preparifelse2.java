package harish;

import java.util.Scanner;

public class preparifelse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner SC=new Scanner(System.in);
		System.out.println("enter salary:");
		int sal=SC.nextInt();
		int asl;
		if(sal>=20000)
		{
			asl=12*sal;
			System.out.println("annual salary for the given salary is:"+asl);
		}
		else
		System.out.println("salary must be more then 20000 to get annual salary");
			
		
		}
			

	}


