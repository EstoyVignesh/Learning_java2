package intermediate;
class Animal1
{
	void eat()
	{
		System.out.println("Eating");
	}
}

//level 1
class Dog extends Animal1
{
	void dog()
	{
		System.out.println("Dog is barking");
	}
}

//level 2
class Cat extends Dog
{
	void cat()
	{
		System.out.println("This is cat class");
	}
}

public class MultilevelInheritanceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat obj = new Cat();
		obj.eat();
		obj.dog();
		obj.cat();

	}

}
