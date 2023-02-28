package harish;

import java.util.Scanner;

public class nestedifelse3 {

	public static void main(String[] args) {
		Scanner SC=new Scanner(System.in);
		System.out.println("enter salary");
		double sal=SC.nextInt();
		double gsal;
		int comm;
		if(sal<20000)
		comm=10;
		else if(sal>=20000 && sal<=50000)
			comm=20;
		else
			comm=30;
		gsal=sal+(comm*sal/100);
		System.out.println("gross salary for the given salary is"+gsal);
		
			
		
		

	}

}
