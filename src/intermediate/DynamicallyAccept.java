package intermediate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DynamicallyAccept {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter the number to calculate factorial");
		
		//first way
		//Scanner class
		Scanner sc = new Scanner(System.in);
		
		//int input=sc.nextInt();
		
		
		//Second way
		InputStreamReader in= new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		//BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

		String input1= br.readLine();
		
		//converst the string to integer
		int input=Integer.parseInt(input1);
	
		
		
		System.out.println("The given input is "+input);
		
		
		long fact = 1;
		for(int i=1;i<=input;i++) {
		fact = fact * i;
		}
		
		System.out.println("The factorial reult is "+fact);

	}

}
