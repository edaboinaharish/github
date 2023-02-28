package oopsexamples;

class clasmethods
{
	public void swap(int i, int j)
	{
		System.out.println("intially:frist number:"+i+"second number:"+j);
		int temp=i;
		i=j;
		j=temp;
		System.out.println("after swaping:frist number:"+i+"second number:"+j);
	}
	public int add(int i,int j)
	{
		return(i+j);
	}
}


public class usingclassmethods 
{

	public static void main(String[] args) 
	{
		clasmethods obj=new clasmethods();
		obj.swap(10,20);
		int result=obj.add(10,20);
		System.out.println("the sum of 10and20is:"+result);
		System.out.println("the squre of"+result+"is:"+result*result);
		

	}

}
