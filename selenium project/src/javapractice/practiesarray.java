package javapractice;

public class practiesarray {

	public static void main(String[] args) 
	{
		int[] a= {10,20,30,40,50};
		int[] b= {11,22,33,44,55};
		int[] c= {1,2,3,4,5};
		int sum=0;

		System.out.print("\na= ");
	      for(int i:a)
	      {
	    	  System.out.print(i+" ");
	      }
	     for(int i:a)
	      {
	    	  sum=sum+i;
	      } 
	      System.out.println("\nthe sum of array a is"+sum);
	      System.out.print("\nb=");
	      for(int i:b)
	      {
	    	 System.out.print(i+" ");
	      }
	      for(int i:b)
	      {
	    	  sum=sum+i;
	      } 
	      System.out.println("\nthe sum of array b is"+sum);

	      System.out.print("\nc=");
	      for(int i:c)
	      {
	    	  System.out.print(i+" ");
	      }
	      for(int i:c)
	      {
	    	  sum=sum+i;
	      } 
	      System.out.println("\nthe sum of array c is"+sum);
  
		
	
	}

}
