package controlStatement2;

public class ElseIfProg2 {

	public static void main(String[] args) {
//employee class( Grade A for high class and B for midium class and C for lower class)		
//a>=90000;b>=75000;c>=40000.

        double salary = 92000.98;
		if (salary >= 40000 && salary <70000)
		{
			System.out.println("Employee salary is in Grade C");
			
		}
		else if (salary >=70000 && salary< 80000)
		{
			System.out.println("Employee salary is in Grade B");
		}
		else
		{
			System.out.println("Employee salary is in Grade A");
		}
		

	}

}
