package controlStatement2;

public class NetstedIfProg1 {
	//WAP TO LOGIN TO FB

	public static void main(String[] args) {
		String username ="admin";
		String password = "Admin@123";
		if (username == "admin")
		{
			System.out.println("Username is correct, now enter the password");
		if (password == "Admin@123")
		{
			System.out.println("password correct,login sucessful");
		}
		else 
		{
			System.out.println("incorrect password entered");
		  }	
		}
		else
        {
			System.out.println("Username is incorrect");
		}
	   }
	}


