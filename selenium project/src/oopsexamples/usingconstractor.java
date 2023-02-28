package oopsexamples;
class employee
{
	public int empid;
	public String empname;
	public employee()
	{
     empid=111;
     empname="e";
	}
	public employee(int id,String name)
	{
		empid=id;
		empname=name;
	}
	public void display()
	{
		System.out.println("id:"+empid);
		System.out.println("neme:"+empname);
//		System.out.println("*********");
	}
}

public class usingconstractor 
{

	public static void main(String[] args) 
	{
		employee e1=new employee();
		e1.display();
		employee e2=new employee();
		e2.empid=100;
		e2.empname="harish";
		e2.display();
		employee e3=new employee(101,"hari");
		e3.display();
		
		

	}

}
