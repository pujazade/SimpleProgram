
package Class_Object;

public class ObjectProg1 {
	public void add()                                                  //when Static is not given then line 14 and 16 entered.
	{
		int num1=10,num2=20,sum;
		sum= num1+num2;
		System.out.println("Sum =" +sum);
	}
	
	public static void main(String[] args) {
		
		ObjectProg1 i = new ObjectProg1();
		System.out.println("This is start of main method");
		 i.add();
		 System.out.println("This is end of main method");
	}

}



 
