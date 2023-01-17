package controlStatement2;

public class SwitchProg2 {

	public static void main(String[] args) {
		String day = "Saturday";
		switch(day)
		{
		case "Monday":
			System.out.println("Today is a Monday");
		break;
		case "Tuesday":
			System.out.println("Today is a Tuesday");
		break;
		
		case "Wendsday":
			System.out.println("Today is a Wendsday");
		break;
		
		case "Thursday":
			System.out.println("Today is a Thursday");
		break;
		
		case "Friday":
			System.out.println("Today is a Friday");
		break;
		default:
			System.out.println("Wow, today is weekend!");
		    }
		}

}
