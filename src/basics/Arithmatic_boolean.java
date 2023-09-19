package basics;

public class Arithmatic_boolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		
	
		
		int a = 8;
		int b = 4;
		int c = a+b;
		int c1 = a-b;
		int c2 = a*b;
		int c3 = a/b;
		int c4 = a%b;
		
		System.out.println("The value of variable c is "+ c);
		System.out.println("The value of variable c1 is "+ c1);
		System.out.println("The value of variable c2 is "+ c2);
		System.out.println("The value of variable c3 is "+ c3);
		System.out.println("The value of variable c4 is "+ c4);                             */
		
		
//=================    ===============================          =====================
		//logical ANd =&&
		//logical OR = ||
		
		int num1=50, num2=20, num3=24;
		boolean retVal=false;
		
		if( (num1<num2) && (num2<num1) )
		{
			retVal=true;
			System.out.println("AND Condition "+retVal);
		}
		 if( (num1<num2) || (num2<num1) )
		{
			retVal=true;
			System.out.println("AND Condition "+retVal);
		}
		 if ((num1<num2) && (num3<num1))
		{
			retVal=true;
			System.out.println("OR Condition "+retVal);
		}
		
	}

}
