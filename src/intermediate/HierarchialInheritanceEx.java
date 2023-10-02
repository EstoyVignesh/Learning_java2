package intermediate;
class Animal2
{
	void eat()
	{
	System.out.println("This is parent class or super class or base class");
	}
}

class Dog2 extends Animal2
{
	void bark()
	{
		System.out.println("Barking");
	}
}

class Cat2 extends Animal2
{
	void cat()
	{
		System.out.println("This is cat class");
	}
}

public class HierarchialInheritanceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog2 obj = new Dog2();
		obj.eat();
		obj.bark();
		
		
		Cat2 obj1= new Cat2();
		obj1.eat();
		obj1.cat();
		
	}

}
