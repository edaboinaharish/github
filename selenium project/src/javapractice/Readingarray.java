package javapractice;
import java.util.Scanner;
public class Readingarray 
{

	public static void main(String[] args) 
	{
		int[]a=new int[3];
		Scanner SC=new Scanner(System.in);
		for(int i=0;i<a.length; i++)
		{
			System.out.print("enter element"+(i+1)+"value");
			a[i]=SC.nextInt();
		}
		System.out.print("a=");
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		int max=a[0];
		for(int i=1; i<a.length; i++)
		{
			if(a[i]>max);
			{
				max=a[i];
			}
			
		}

	}

}
