package basics;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num;
		num = new int[4];
		num[0]=100;
		num[1]=150;
		num[2]=200;
		num[3]=250;
		
		System.out.println("The Value of num is "+num);
		
		
		// Second Method
		int[] num1= {25,35,45,55,65};
		System.out.println("The VAlue is "+num1.length);
		
		//Third Way
		
		int num2[]= new int[4];
		int num3[]= {1,2,3,4,5};
		System.out.println("THe value of num3 is "+num3[3]);
	}

}
