package intermediate;
//Inheritance is one of the OOPS concepts using which we can inherit the parent class properties into the child class. This can be done extends keyword
//Inheritance is adopted for better code reusability.

//Single inheritance --> If only a single child class has inherited the parent class then it is called as Single inheritance

//Parent class or Base class
class Animal
{
	String animalName="dog";
	void eat()
	{
		System.out.println("This is the parent class");
	}
}

//Child class or sub class or derived class

public class SingInheritanceEx extends Animal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingInheritanceEx obj1 = new SingInheritanceEx();
		obj1.eat();
		System.out.println("Animal name is "+obj1.animalName);
	}

}
