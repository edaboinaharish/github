package oopsexamples;
class methods2
{
	public  void swap (int i,int j)
{
	System.out.println(" initially : first number :"  +i+  "second number :"   +j);
	int temp=i;
	i=j;
	j= temp;
	System.out.println(" After swaping : first number: firstnumber:"    +i+     "second number: "  +j);
   }
	
	public int Add (int i ,int j)
	
	{
				return (i+j);
	}
		
}	
      public  class usingmethods2

    {
	
       public  static void main(String[] args) 
	
	{
		
		clasmethods obj= new clasmethods();
		
		obj.swap(10,20);
		int result = obj.add(10,20);
		System.out.println(" the sum of 10 and 20 is :"  + result);
		System.out.println("the square of " + result*result);
		
		
	}
}



	
