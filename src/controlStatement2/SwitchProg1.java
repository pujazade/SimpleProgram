package controlStatement2;

public class SwitchProg1 {

	public static void main(String[] args) {
// prog based on Calculator
		
		int a=20 ,b=10, c;
		char operator = '%';
		switch(operator)
		{
		case '+':
		c = a+b;
		System.out.println("Addition of Two Numbers is " +c);
        break;
	
		case '-':
		c = a-b;
		System.out.println("Substraction of two numbers is " +c);
		break;
		
		case '*':
		c = a*b;
		System.out.println("Multiplication of two numbers is " +c);
		break;
		
		case '/':
		c = a/b;
		System.out.println("Dividation of two numbers is " +c);
		break;
		
		case '%':
		c= (a*b)/100;
		System.out.println("percentage between two numbers is " +c);
		break;
		
		default:
			System.out.println("invalid option");
			
		}
	
	}

}
