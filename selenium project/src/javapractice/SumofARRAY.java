package javapractice;

public class SumofARRAY
{

	public static void main(String[] args)
	{
		int[] a= {10,20,30,40,50};
		int[] b= {11,22,33,44,55};
		int[] c= {1,2,3,4,5};
		int sum=0;
		
		System.out.print("a= ");
		for(int i:a)	
		{
			sum=sum+i;
			i++;
		}
		{
			System.out.println(+sum);
			
		}
		System.out.print("b= ");
		for(int i:b)
		{
			sum=sum+i;
			i++;
		}
		{
			System.out.println(+sum);
		}
		System.out.print("c= ");
		for(int i:c)
		{
			sum=sum+i;
			i++;
		}
		{
			System.out.println(+sum);
		}


	}

}
