package Class_Object;

public class ObjectProg2 {
	
	public static void prog()                                              // When Static is given then line 14 and 16 not entered.
	{
		int A=10,B=2,C;
		C = A-B;
		System.out.println("VALUE OF C=" + C);                                      //2nd line display in o/p
		
	}
	public static void main(String[] args) {
		System.out.println("first value is 10");                                    //1st line display in o/p
		prog();
		System.out.println("last value is 2");                                      //3rd line display in o/p
	}

}
