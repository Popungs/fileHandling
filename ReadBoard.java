package filehandling;
import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;

public class ReadBoard {
	//ArrayList<BillBoard> bList = new ArrayList<BillBoard>();
	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		FileInputStream fis = new FileInputStream("data.txt");
//		
//		ObjectInputStream ois = new ObjectInputStream(fis);
		File file = new File("data.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		System.out.println("reading billboard ....");
		
		String line = null;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		
	}
	
}
