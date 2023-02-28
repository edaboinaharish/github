package harish;

import java.util.Scanner;

public class swichcase2 
{

	public static void main(String[] args) 
	{
		String rep ;
		do {
		Scanner SC=new Scanner(System.in);
		System.out.print("enter number1");
		int n1=SC.nextInt();
		System.out.print("enter number2");
		int n2=SC.nextInt();
		int res=0,y;
		System.out.print("enter choice of operation(+/-/*)");
		String choice=SC.next();
		
		boolean isvalid = true;
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
			System.out.println("the arithematic operation"+choice+"on"+n1+"with"+n2+":is"+res);
		}
		else
		{
			System.out.println("invalid choice enterd");
		}
		
		System.out.println("do you want to continue?(y/n)");
		 rep=SC.next();

	
		}while(rep.equals("y")&&!rep.equals("n"));
			
		
		}
	
}
