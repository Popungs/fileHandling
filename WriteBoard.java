package filehandling;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class WriteBoard {
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		ArrayList<BillBoard> bList = new ArrayList<BillBoard>();
		BillBoard bb1 = new BillBoard();
		bb1.setArtist("oasis");
		bb1.setRating(10);
		bb1.setSongName("wonderwall");
		bb1.setSongWriter("noel");
		
		BillBoard bb2 = new BillBoard("shine", 10, "mr.big", "don't know");
		bList.add(bb1);
		bList.add(bb2);
		
		System.out.println("please enter a next entry of billboard ");
		System.out.println("enter songname");
		String newSongName = s.nextLine();
		
		System.out.println("enter song rating");
		int newSongRating = s.nextInt();
		s.nextLine();
		System.out.println("enter artist ");
		String newSongArtist = s.nextLine();
		
		System.out.println("enter song writer");
		String newSongWriter = s.nextLine();
		
		System.out.println("Thank you for your input");
		BillBoard userBB = new BillBoard(newSongName, newSongRating, newSongArtist, newSongWriter);
		
		bList.add(userBB);
		writeToFile(bList);
		
		
	}
	public static void writeToFile(ArrayList<BillBoard> list) throws IOException {
		System.out.println("writing to the file .... ");
//		FileOutputStream fout = new FileOutputStream("data.txt");
//		ObjectOutputStream oos = new ObjectOutputStream(fout);
		FileWriter myWriter = new FileWriter("data.txt");
		BufferedWriter bw = new BufferedWriter(myWriter);
		for (BillBoard b : list) {
			bw.write(b.toString());
			bw.newLine();
		}
		bw.close();
		myWriter.close();
		
		
		
		
		
		System.out.println("completed file write");
	}
}
