package javapractice;

public class equals
{

	public static void main(String[] args)
	{
	String str1="java";
	String str2="java";
	String str3="JAVA";
	String str4="programs";
	
    System.out.println(str1.equals(str2));
    System.out.println(str1.equals(str3));
    System.out.println(str1.equalsIgnoreCase(str3));
    System.out.println(str1.equals(str4));
			
	}

}
