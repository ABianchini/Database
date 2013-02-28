package filesystem;

import java.io.BufferedWriter;
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
		int spaceCount = 0;
		int shiftEnd = 0;
		int shiftMid = 0;
		
		System.out.println();
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
		
		System.out.println();
		System.out.println(">Enter line to append. Type \"exit\" to stop appending lines.");
		String input = "";
		
		
		FileWriter out = new FileWriter(files[selection], true);
		BufferedWriter writer = new BufferedWriter(out);
		while (!input.equals("exit")) {
			input = add.nextLine();
			if (!input.equals("exit")) {
				char[] inLinePieces = input.toCharArray();
				char[] outLinePieces = new char[inLinePieces.length];
				for (int i = 0; i < inLinePieces.length; i++) {
					
					char outChar = ' ';
					char inChar = inLinePieces[i];
					if (inChar == ' ') {
						if (spaceCount % 3 == 0) {
							outChar = '~';
						} if (spaceCount % 3 == 1) {
							outChar = '^';
						} if (spaceCount % 3 == 2) {
							outChar = '`';
						}
						spaceCount++;
					} else {
						outChar = (char) (inChar + 3);
					}
					outLinePieces[i] = outChar;
				}
				String outLine = new String(outLinePieces);
				shiftEnd = outLine.length()/8;
				shiftMid = outLine.length()/2;
				outLine = outLine.substring(shiftMid, outLine.length()) + outLine.substring(shiftEnd, shiftMid) + outLine.substring(0, shiftEnd);
				writer.append(outLine);
				writer.newLine();
			}
		}
		writer.close();
		out.close();
		in.close();
	}
	
	public static void editFile() throws IOException {
		File[] files = FileLister.getFilesArrayFile();
		int selection = FileChooser.chooseFile();
		Scanner in = new Scanner(files[selection]);
		Scanner add = new Scanner(System.in);
		int spaceCount = 0;
		int shiftEnd = 0;
		int shiftMid = 0;
		
		System.out.println();
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
		
		System.out.println();
		System.out.println(">Enter line to append. Type \"exit\" to stop appending lines.");
		String input = "";
		
		
		FileWriter out = new FileWriter(files[selection], true);
		BufferedWriter writer = new BufferedWriter(out);
		while (!input.equals("exit")) {
			input = add.nextLine();
			if (!input.equals("exit")) {
				char[] inLinePieces = input.toCharArray();
				char[] outLinePieces = new char[inLinePieces.length];
				for (int i = 0; i < inLinePieces.length; i++) {
					
					char outChar = ' ';
					char inChar = inLinePieces[i];
					if (inChar == ' ') {
						if (spaceCount % 3 == 0) {
							outChar = '~';
						} if (spaceCount % 3 == 1) {
							outChar = '^';
						} if (spaceCount % 3 == 2) {
							outChar = '`';
						}
						spaceCount++;
					} else {
						outChar = (char) (inChar + 3);
					}
					outLinePieces[i] = outChar;
				}
				String outLine = new String(outLinePieces);
				shiftEnd = outLine.length()/8;
				shiftMid = outLine.length()/2;
				outLine = outLine.substring(shiftMid, outLine.length()) + outLine.substring(shiftEnd, shiftMid) + outLine.substring(0, shiftEnd);
				writer.append(outLine);
				writer.newLine();
			}
		}
		writer.close();
		out.close();
		in.close();
	}
}
