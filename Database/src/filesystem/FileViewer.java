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
		Scanner input = new Scanner(System.in);
		int shiftEnd = 0;
		int shiftMid = 0;
		
		if (selection < files.length) {
			Scanner in = new Scanner(files[selection]);
			while(in.hasNextLine()) {
				String inLine = in.nextLine();
				
				shiftEnd = inLine.length()/8;
				shiftMid = inLine.length()/2;
				if (inLine.length() % 2 == 0) {
					inLine = inLine.substring(inLine.length() - shiftEnd, inLine.length()) + inLine.substring(shiftMid, inLine.length() - shiftEnd) + inLine.substring(0, shiftMid);
				} else {
					inLine = inLine.substring(inLine.length() - shiftEnd, inLine.length()) + inLine.substring(shiftMid + 1, inLine.length() - shiftEnd) + inLine.substring(0, shiftMid + 1);
				}
				
				char[] inLinePieces = inLine.toCharArray();
				char[] outLinePieces = new char[inLinePieces.length];
				for (int i = 0; i < inLinePieces.length; i++) {
					char outChar;
					char inChar = inLinePieces[i];
					if (inChar == '~' || inChar == '`' || inChar == '^') {
						outChar = ' ';
					} else {
						outChar = (char) (inChar - 3);
					}
					outLinePieces[i] = outChar;
				}
				String outLine = new String(outLinePieces);
				System.out.println(outLine);
			}
			System.out.println(">Press Enter when done reading.");
			input.nextLine();
		} else {
			System.out.println(">No such file exists");
		}
		
	}
}