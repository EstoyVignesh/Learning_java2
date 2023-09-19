package basics;

public class Methods_homework {
	
	int a= 10;
	int b= 20;
	int c;
	
	public  void arithmaticoperations() {
		
		int a= 10;
		int b= 20;
		
		
		int c = a+b;
		int c1 = a-b;
		int c2 = a*b;
		int c3 = a/b;
		int c4 = a%b;
		
		System.out.println("The value of variable c is "+ c);
		System.out.println("The value of variable c1 is "+ c1);
		System.out.println("The value of variable c2 is "+ c2);
		System.out.println("The value of variable c3 is "+ c3);
		System.out.println("The value of variable c4 is "+ c4);
		
		
	}
	
	public void arith_operations(int a,int b) {
		int f = a+b;
		int f1 = a-b;
		int f2 = a*b;
		int f3 = a/b;
		int f4 = a%b;
		
		System.out.println("The value of variable f is "+ f);
		System.out.println("The value of variable f1 is "+f1);
		System.out.println("The value of variable f2 is "+ f2);
		System.out.println("The value of variable f3 is "+ f3);
		System.out.println("The value of variable f4 is "+ f4);
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Methods_homework ans = new Methods_homework();
		ans.arithmaticoperations();
		ans.arith_operations(18,22);

	}

}
