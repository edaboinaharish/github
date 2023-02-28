package harish;

import java.util.Scanner;

public class usingdowhile 
{

	public static void main(String[] args) 
	{
		Scanner SC= new Scanner(System.in);
		String uid,pwd;
		do
		{
			System.out.println("enter user name:");
			uid=SC.next();
			System.out.println("enter password:");
			pwd=SC.next();
		}
		while(!uid.equals("java")||!pwd.equals("programes"));
		
		}
		
	

	}


