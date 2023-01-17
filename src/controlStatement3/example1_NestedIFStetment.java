package controlStatement3;
//Netsted If Program copy (wap to login FB )
public class example1_NestedIFStetment {

	public static void main(String[] args) {
	String loginId = "User";
	String password = "ddmmyy";
	if (loginId == "User")
	{
		System.out.println("login id is correct.now enter the password");
    if (password == "ddmmyy")
    {
    	System.out.println("password is correct,login Successful");
    	
    }
    else 
    {
    	System.out.println("password is incorrect");
    	}
	}
	else
	{
		System.out.println("login id is invalid");
		}
       }   
    }
