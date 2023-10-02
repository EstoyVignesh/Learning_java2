package advanced;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReading {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		
		File file = new File("C:\\Users\\arvin\\eclipse-workspace\\learn_java\\Helloworld.txt");
		Scanner sc = new Scanner(file);
		
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}

		
	}

}
