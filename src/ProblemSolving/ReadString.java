package ProblemSolving;

import java.util.Scanner;

public class ReadString {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Read the Strings and apply Contains method :");
		
		String a = sc.nextLine();
		String b = sc.nextLine();
		
		System.out.println("a contains b :"+ a.contains(b));
		
		
	}

}
