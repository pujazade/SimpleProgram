package controlStatement3;

public class example2_ElseIf {
//ElseIfprogram copy
	public static void main(String[] args) {
		
		int marks = 99;
		if(marks>=45 && marks<59)
		{
			System.out.println(" student is passed");
		}
		else if(marks>=60 && marks<75)
		{
			System.out.println("student got grade B");
		}
		else if(marks>=76 && marks<85)
		{
			System.out.println("Student got Grade A");
		
		}
		else if(marks>=86 && marks<100)
		{
			System.out.println("Student is passed in merit");
		}
		else
		{
			System.out.println("Student is Failed");
		}
		
	}

}
