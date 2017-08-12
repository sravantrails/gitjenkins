package servlet.checking;

public class LoginDao {  
	public static boolean validate(String name,String pass){  
		boolean status=false;
		System.out.println(name+" "+pass);
		if("sravan".equals(name) && pass.equals("sravan") )
			return true;
		return status;  
	}  
}  