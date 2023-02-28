package javapractice;

public class array 
{

	public static void main(String[] args) 
	{
		int[] a= {10,20,30,40,50};
		int[] b= {11,22,33,44,55};
		System.out.println("initially");
		System.out.print("a= ");
	for(int i:a)
	{
		System.out.print(i+" ");
	}
//	System.out.println();
	System.out.print("\nb= ");
	for(int i:b)
	{
		System.out.print(i+" ");
	}
	System.arraycopy(a, 1, b, 2, 2);
	
	System.out.println("\nafter copy");
	System.out.print("a= ");
for(int i:a)
{
	System.out.print(i+" ");
}
//System.out.println();
System.out.print("\nb= ");
for(int i:b)
{
	System.out.print(i+" ");
}

	
	
	
	
	
	}

}
