package basics;

public class Fctorialobj {
	
	int employeeAge = 100;
	
	public void factorialCalc() {
		   int n = 5;
			  
			long fact = 1;
			for(int i=1;i<=n;i++) {
			fact = fact * i;
				
					
			}
			
			System.out.println(fact);	  
	}
	
	public void factorialObj(int n) {
		long fact = 1;
		for(int i=1;i<=n;i++) {
		fact = fact * i;
			
				
		}
		
		System.out.println(fact);	  
}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fctorialobj fact = new Fctorialobj();
		fact.factorialCalc();
		fact.factorialObj(5);
		
		// Second object
		Fctorialobj obj = new Fctorialobj();
		obj.factorialObj(8);
		System.out.println("The Age of the Employee is "+ obj.employeeAge);
		
	}

}
