package oopsexamples;

class sample
{
	public int i=10;
	public static int s=20;
	public int getsqure(int i)
	{
		return(i*i);
	}
	public static double getPI()
	{
		return(5.5);
	}
}

public class usingoppsdemo
{

	public static void main(String[] args) 
	{
		System.out.println("s="+sample.s);
		System.out.println("the 2PI value is:"+2*sample.getPI());
		sample obj=new sample();
		System.out.println("i="+obj.i);
		System.out.println("the squre of is:"+obj.getsqure(5));
		
		
 
	}

}
