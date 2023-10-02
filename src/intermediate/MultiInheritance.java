package intermediate;

class Grandpa{
	String name = "Pure Gold";
			void mine() {
		System.out.println("The Grandpa Gives his Gold to his Son");
	}
}
class Father extends Grandpa{
	String name1 = "Farm Land";
	
	void prop() {
		System.out.println("The Father gave his farm land To his Son");
	}
}
class Son extends Father{
	String name2 = "Wealth";
			void obtain() {
		System.out.println("The Son Obtains Land and Gold from his Fathet and Grandpa");
	}
}
public class MultiInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Son obj = new Son();
obj.mine();
obj.prop();
obj.obtain();
System.out.println(obj.name);
System.out.println(obj.name1);
System.out.println(obj.name2);


	}

}
