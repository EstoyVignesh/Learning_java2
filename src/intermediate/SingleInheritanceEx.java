package intermediate;



class parent{
	String name  = "Tortoise";
	String name1 = "Rabbit";

	void display() {
		System.out.println("The Child Inherits Wealth from Parents");
	}
}

public class SingleInheritanceEx extends parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleInheritanceEx obj = new SingleInheritanceEx();
		obj.display();
		System.out.println("The name of the Animal is "+obj.name+obj.name1);
		
		
	}

}
