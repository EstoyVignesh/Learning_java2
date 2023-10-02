package intermediate;

interface A1
{
	void a();
}

interface B1 extends A1
{
	void b();
}

public class InterfaceExtends implements B1 {
	
	@Override
	public void a() {
		// TODO Auto-generated method stub
		System.out.println("Method A");
		
	}

	@Override
	public void b() {
		// TODO Auto-generated method stub
		System.out.println("Method B");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceExtends obj = new InterfaceExtends();
				obj.a();
				obj.b();

	}

	

}
