package intermediate;

class Emperors{
	private String emperorName;
	private String emperorName1;
	private int emperorAge;
	private int emperorAge1;
	public String getEmperorName() {
		return emperorName;
	}
	public void setEmperorName(String empName) {
		emperorName = empName;
	}
	public String getEmperorName1() {
		return emperorName1;
	}
	public void setEmperorName1(String empName1) {
		emperorName1 = empName1;
	}
	public int getEmperorAge1() {
		return emperorAge1;
	}
	public void setEmperorAge1(int empAge1) {
		emperorAge1 = empAge1;
	}
	public int getEmperorAge() {
		return emperorAge;
	}
	public void setEmperorAge(int empAge) {
		
		emperorAge = empAge;
	}
	
}


public class Encapsulation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Emperors sea = new Emperors();
sea.setEmperorName("MonkeyDLuffy");
sea.setEmperorAge(19);

sea.setEmperorName1("AkagamiNoShanks");
sea.setEmperorAge1(42);
		

System.out.println("The Name of the Emperor is : "+sea.getEmperorName());
System.out.println("The Age of the Emperor is : "+sea.getEmperorAge());

System.out.println("The Name of the Emperor is : "+sea.getEmperorName1());
System.out.println("The Age of the Emperor is : "+sea.getEmperorAge1());



//System


	}

}
