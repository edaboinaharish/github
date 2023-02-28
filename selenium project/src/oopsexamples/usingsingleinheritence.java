package oopsexamples;
class company
{
 public String compname;
 public String compadd;
 public company()
 {
	 compname="mindQ systems";
	 compadd="hyderabad,india";
 }
 public void display()
 
 
 {
	System.out.println("company name:"+compname); 
	System.out.println("hyderabad,india");
 }
 }
  class emp extends company
  
  
  {
	  public int empid;
	  public String empname;
	  public String desig;
  
   public void display()
  
   {
	 System.out.println("id:"+empid);
	 System.out.println("name:"+empname);
	 System.out.println("desigenation:"+desig);
	 super.display();
   }
  }
  
    public class usingsingleinheritence
    {

	public static void main(String[] args)
	
	{
		emp obj=new emp();
		obj.empid=100;
		obj.empname="harish";
		obj.desig="tester";
		obj.display();

	}

}
