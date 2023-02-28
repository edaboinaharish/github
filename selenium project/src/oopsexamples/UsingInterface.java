package oopsexamples;

import java.util.Scanner;
interface MyBankAccount
{
	public double getbalance();
	void deposit(double amt);
	boolean withdraw(double amt);
}
class currentaccount implements MyBankAccount
{

	public double lbalance; 
	
	public double getbalance()
	{
		return lbalance;
	}
   public void deposit(double amt)
	{
    lbalance=lbalance+amt;
    }
   public boolean withdraw(double amt)
   {
    if(amt<=lbalance)
    {
    	lbalance=lbalance-amt;
    	return true;
    }
    else

		return false;
	}
	
}
public class UsingInterface
{

	public static void main(String[] args)
	{
     Scanner sc= new Scanner(System.in);
     currentaccount s=new currentaccount();
     System.out.println("initial balance"+s.getbalance());
     System.out.println("enter deposit amount");
     double dAmt=sc.nextDouble();
     s.deposit(dAmt);
     System.out.println("after deposit balance"+s.getbalance());
     System.out.println("enter withdraw amount");
     double wAmt=sc.nextDouble();
     boolean result=s.withdraw(wAmt);
     if(result==true)
     {
    	 System.out.println("the withdrawal amount is:"+s.getbalance());
     }
     else
     {
    	 System.out.println("insufficient funds.withdarwal canceled");
     }
	}
}

