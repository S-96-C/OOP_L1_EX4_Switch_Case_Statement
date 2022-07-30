public class Main {
	public static void main(String[] args){

		int dayNum = 7;
		String day;
		System.out.println("Value of the day : " +dayNum);
		switch(dayNum){
			case 1 : day = "Monday";
					break;
					
			case 2 : day = "Tuesday";
					break;
					
			case 3 : day = "Wednesday";
					break;
					
			case 4 : day = "Thursday";
					break;
					
			case 5 : day = "Friday";
					break;
					
			case 6 : day = "Saturday";
					break;
					
			case 7 : day = "Sunday";
					break;
					
			default : day = "Invalid day";
					break;
			
		}
		System.out.println("Day of the week : " +day);
		System.out.println("Good Bye!");
		
	}
}