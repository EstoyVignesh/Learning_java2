package basics;

public class Assignment_Logical_operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 5;
		num1+=3;
		int num2=6;
		num2-=1;
		int num3=15;
		num3*=6;
		int num4=15;
		num4/=5;
		int num5=5;
		num5%=2;
		System.out.println("The Assignment value for Addition is "+num1);
		System.out.println("The Assignment value for Substraction is "+num2);
		System.out.println("The Assignment value for Multiplication is "+num3);
		System.out.println("The Assignment value for Division is "+num4);
		System.out.println("The Assignment value for modulus is "+num5);
		
		
		
	//	==============                  =========================           ===============
				
	// Logical Operators
		
		int a = 12,  b = 8,  c = 21;
		boolean Retval = false;
		
		if((a>b)&&(b<a)){
			Retval = true;
			System.out.println(Retval);
			
		}else if ((a<b)&&(b>a)) {
			Retval = true;
			System.out.println(Retval);
			
		}else
			Retval = true;
			System.out.println(Retval);
				
		
		
	}

}
