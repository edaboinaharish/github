package oopsexamples;

public class clsallmethodes extends clsmethfunctiones
                            implements instringfunctiones
       
{

	@Override
	public String strreverse(String str) 
	{
		String strreverse=" ";
		for(int i=str.length()-1;i>=0;i--)
		{
			strreverse=strreverse+str.charAt(i);
			
		}
		return strreverse;
	}
		
	@Override
	public String getid(String email) {
		
		return(email.substring(0,email.indexOf('@')));
	}
	

}
