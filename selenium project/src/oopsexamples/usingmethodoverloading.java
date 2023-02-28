package oopsexamples;
class clsoverload
{
	public int add(int i,int j)
	{
		return(i+j);
	}
	public int add(int i,int j,int k)
	{
		return(i+j+k);
	}
	public String add(String s1,String s2)
	{
		return(s1.concat(s2));
	}
}

public class usingmethodoverloading 
{

	public static void main(String[] args) 
	{
		clsoverload obj=new clsoverload();
		System.out.println("the sum of 100 and 200 is:"+obj.add(100, 200));
		System.out.println("the addition of 10,20 and 30 is:"+obj.add(10, 20,30));
		System.out.println("the concatenation of'java'and'program'is:"+obj.add("java", "programs"));
		

	}

}
