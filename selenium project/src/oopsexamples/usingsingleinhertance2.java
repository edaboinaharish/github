package oopsexamples;
class harish
{
	public String compname;
	public String compadd;
	public harish()
	{
		compname="mindQ systems";
		compadd="hyderabad,india";
	}
	public void display()
	{
		System.out.println("compname:"+compname);
		System.out.println("company address:"+compadd);
	}
}

   class student extends harish
{
   public int empid;
   public String empname;
   public String desig;
   
   public void display()
   {
	   
	   System.out.println("id:+empid");
	   System.out.println("name:+empname");
	   System.out.println("desigenation:+empdesi  g");
	   super.display();
   }
   
}

public class usingsingleinhertance2 
{

	public static void main(String[] args) 
	{
		emp obj=new emp();
		obj.empid=123;
		obj.empname="eedaboina";
		obj.desig="tester";
		obj. display();
		

	}

}
