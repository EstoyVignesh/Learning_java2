package intermediate;

class B{
	private int a = 10;
	int b = 23;
	private void gps(){
		System.out.println("Private Modifier");
	}
	
	void vrs(){
		System.out.println("Default Modifier");
		
	}
}


public class PrivateModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
B bc = new B();
//bc.gps();
bc.vrs();

//System.out.println(bc.a);
System.out.println(bc.b);

	}

}
