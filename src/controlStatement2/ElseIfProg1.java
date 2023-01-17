package controlStatement2;

public class ElseIfProg1 {

	public static void main(String[] args) {
		int marks =62;
		if(marks >= 40 && marks <60)
		{
		System.out.println("Student is pass in second class");	
		}
		else if(marks>=60 && marks<75)
		{
			System.out.println("Student is pass in First class");
		}
		else if(marks>=75 && marks<89)
		{
			System.out.println("Student is pass in Distriction");
		}
		else if (marks>=90 && marks<100)
		{
			System.out.println("Student is pass in Merit ");
		}
		else
		{
			System.out.println("Student is fail");
		}
		
	}

}


//pass,fail,f.class,s.class,distriction,merit    
//40-59--->s.class
//60-74--->F.class
//75-89--->Distriction
//90-100--->Merit
//<40--> Fail
//>100-->NA 

//& or |
//0 &  0 = 0
//0 &  1 = 0
//1 &  0 = 0
//1 &  1 = 1 multiply

//& or |
//0 | 0 =0
//0 | 1 =1
//1 | 0 =1
//1 | 1 =0   Addition