package filesystem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileEditor {
	public static void main(String args[]) throws IOException {
		File[] files = FileLister.getFilesArrayFile();
		int selection = FileChooser.chooseFile();
		Scanner in = new Scanner(files[selection]);
		Scanner add = new Scanner(System.in);
		
		System.out.println();
		while(in.hasNextLine()) {
			String inLine = in.nextLine();
			System.out.println(inLine);
		}
		
		System.out.println();
		System.out.println("Enter line to append. Type \"exit\" to stop appending lines.");
		String input = "";
		
		
		FileWriter out = new FileWriter(files[selection], true);
		while (!input.equals("exit")) {
			input = add.nextLine();
			if (!input.equals("exit")) {
				input = input + "\n";
				out.append(input);
			}
		}
		out.close();
		in.close();
	}
	
	public static void editFile() throws IOException {
		File[] files = FileLister.getFilesArrayFile();
		int selection = FileChooser.chooseFile();
		Scanner in = new Scanner(files[selection]);
		Scanner add = new Scanner(System.in);
		
		System.out.println();
		while(in.hasNextLine()) {
			String inLine = in.nextLine();
			System.out.println(inLine);
		}
		
		System.out.println();
		System.out.println("Enter line to append. Type \"exit\" to stop appending lines.");
		String input = "";
		
		
		FileWriter out = new FileWriter(files[selection], true);
		while (!input.equals("exit")) {
			input = add.nextLine();
			if (!input.equals("exit")) {
				input = input + "\n";
				out.append(input);
			}
		}
		out.close();
		in.close();
	}
}
