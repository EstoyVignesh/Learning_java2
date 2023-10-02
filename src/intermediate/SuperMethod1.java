package intermediate;

class Entry{
	
	void empDetails() {
		System.out.println("The EmpDetails are Unknown");
		
	}
}
class NoEntry extends Entry{
	void empDetails() {
		System.out.println("The empDetails are known");
		
	}
	void unkown() {
		empDetails();
		//super.empDetails();
		
	}
}


public class SuperMethod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
NoEntry ent = new NoEntry();
ent.unkown();
ent.empDetails();


	}

}
