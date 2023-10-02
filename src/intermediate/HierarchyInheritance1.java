package intermediate;

class First{
	String name = "Flower";
	void plant() {
		System.out.println("The Plant has a Beatiful Flower");
		
	}
}

class Second extends First{
	String name1 = "Fruit";
	void Tree() {
		System.out.println("The Tree Bears a Sweet Fruit ");
		
	}
}

class Third extends First{
	String name2 ="Dolphin";
	void Fish() {
		System.out.println("The Dolphin is a Mysterious Fish");
	}
	
}
public class HierarchyInheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Second sec = new Second();
sec.plant();
sec.Tree();

Third thud = new Third();
thud.Fish();
thud.plant();

System.out.println(sec.name);
System.out.println(sec.name1);


System.out.println(thud.name2);
System.out.println(thud.name);



	}

}
