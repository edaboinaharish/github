package harish;

import java.util.Scanner;

interface Ibankaccount
{
	double getbalance();
	void deposite(double amt);
	boolean withdraw(double amt);
}
class SavingsAccount implements Ibankaccount
{

	private double Ibalance ;

	
	public double getbalance() 
	{
		return Ibalance;
	}

	
	public void deposite(double amt) 
	{
		Ibalance=Ibalance+amt;
		
	}

	
	public boolean withdraw(double amt) 
	{
		if(amt<=Ibalance)
		{
		Ibalance=Ibalance-amt;
		return true;
	}
	else

		return false;

	}

	
}
public class  interfaceinheritance 
{

	public void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	SavingsAccount sobj=new SavingsAccount();
	System.out.println("initial balance"+sobj.getbalance());
	System.out.println("enter amount to deposite:");
	double damt=sc.nextDouble();
	sobj.deposite(damt);
	System.out.println("after deposite balance"+sobj.getbalance());
	System.out.println("enter amount to withdraw:");
	double wamt=sc.nextDouble();
	boolean result=sobj.withdraw(wamt);
	if(result==true)
	{
		System.out.println("after withdraw balance:"+sobj.getbalance());
	}
	else
	{
		System.out.println("insufficent fund.withdraw failed");
	}
	

	}

}





