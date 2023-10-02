package basics;

public class SwitchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		switch(expression or value)
		{
			case value:
				code ;
				break;
			case value:
				code;
				break;
			default:
				code;
		
		}
		*/
		
		/*
		 * Print the month name depending on the value
		 */
		
		int month=13;
		String monthName="";
		
		switch(month) {
			case 1:
				monthName="Januray";
				break;
				
			case 2:
				monthName="Feburay";
				break;
				
			
			case 3:
				monthName="March";
				break;
			
			case 4:
				monthName="April";
				break;
				
			case 5:
				monthName="May";
				break;
			
			case 6:
				monthName="June";
				break;
			
			case 7:
				monthName="July";
				break;
			
			case 8:
				monthName="August";
				break;
				
			case 9:
				monthName="September";
				break;
				
			case 10:
				monthName="October";
				break;
				
			case 11:
				monthName="November";
				break;
				
			case 12:
				monthName="December";
				break;
				
			default:
				System.out.println("Invalid month");
				
		}
		
		System.out.println("The month name for "+month+" is "+monthName);
			
			
			
			}

}
