package filesystem;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileCreator {
	public static void main(String args[]) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);
		System.out.println(">Enter your new file name:");
		String fileName = in.nextLine() + ".txt";
		boolean exist = false;
		
		String[] files = FileLister.getFilesArrayString();
		for (int i = 0; i < files.length; i++) {
			if (files[i].equals(fileName)) {
				exist = true;
			}
		}
		if (!exist) {
			String output = "C:\\Files\\"+fileName;
			PrintWriter out = new PrintWriter(output);
			out.print("");
			out.close();
		} else {
			System.out.println(">File already exists");
		}
	}
	
	public static void createFile() throws FileNotFoundException {
		Scanner in = new Scanner(System.in);
		System.out.println(">Enter your new file name:");
		String fileName = in.nextLine() + ".txt";
		boolean exist = false;
		
		String[] files = FileLister.getFilesArrayString();
		for (int i = 0; i < files.length; i++) {
			if (files[i].equals(fileName)) {
				exist = true;
			}
		}
		if (!exist) {
			String output = "C:\\Files\\"+fileName;
			PrintWriter out = new PrintWriter(output);
			out.print("");
			out.close();
		} else {
			System.out.println(">File already exists");
		}
	}
}
