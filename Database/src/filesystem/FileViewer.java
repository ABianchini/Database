package filesystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileViewer {
	public static void main(String args[]) throws FileNotFoundException {
		File[] files = FileLister.getFilesArrayFile();
		int selection = FileChooser.chooseFile();
		Scanner in = new Scanner(files[selection]);
		while(in.hasNextLine()) {
			String inLine = in.nextLine();
			System.out.println(inLine);
		}
	}
	
	public static void viewFile() throws FileNotFoundException {
		File[] files = FileLister.getFilesArrayFile();
		int selection = FileChooser.chooseFile();
		Scanner in = new Scanner(files[selection]);
		while(in.hasNextLine()) {
			String inLine = in.nextLine();
			System.out.println(inLine);
		}
	}
}