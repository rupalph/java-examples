import java.io.*;
import java.util.Scanner;

public class FileProcessor {
	
	public FileProcessor(String filename) {
		File file = new File(filename);
		try {
			Scanner sc= new Scanner(file);
			 //TODO: read file and store it by lines.
			}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	private int countWords() {
		//TODO:
		
	}
	private int countLines() {
		
		//TODO:
	}	
	public static void main(String[] args){
		FileProcessor fp = new FileProcessor("news.txt");
    System.out.println("Total words in file:"+fp.countWords());
    System.out.println("Total line in file:"+fp.countLines());
	}
	
}
