package advanced;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
File file = new File("C:\\Users\\arvin\\eclipse-workspace\\learn_java\\Helloworld1.txt");
		
		String lineToAdd="This is the first line of the program";

		FileWriter fWriter= new FileWriter(file);
		
		fWriter.write(lineToAdd);
		
		System.out.println("File is written");
		
		fWriter.close();
		
		

	}

}
