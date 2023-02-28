package harish;

import java.util.Scanner;

public class swichprogram 
{

	public static void main(String[] args) 
	{
		Scanner SC=new Scanner(System.in);
		System.out.println("enter number 1");
		int n1=SC.nextInt();
		System.out.println("enter number 2");
		int n2=SC.nextInt();
		System.out.println("enter choice of operation(+/-/*)");
		String choice=SC.next();
		int res=0; 
		boolean isvaild=true;
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
			isvaild=false;
			break;
		}
			
			
			 if(isvaild==true)
				{
				System.out.println("the arithematic operation"+choice+"on"+n1+"with"+n2+":is"+res);
				}
				else
				{
					System.out.println("invalid choice enterd");
				}
			
		
			
			
		}
	}
		
		




