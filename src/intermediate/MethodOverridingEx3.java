package intermediate;

class Sports
{
	void fishing()
	{
		System.out.println("The fishing helps Stress relieving");
	}
}

class Film extends Sports
{
	void fishing()
	{
		System.out.println("The Fishing Show is good");
	}
}

class IT extends Sports
{
	void fishing()
	{
		System.out.println("The IT field is rather Down this year");
	}
}
public class MethodOverridingEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IT it = new IT();
		it.fishing();
		
		Film h = new Film();
		h.fishing();
	}

}
