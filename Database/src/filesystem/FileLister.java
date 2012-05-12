package filesystem;

import java.io.File;
import java.nio.file.Files;

public class FileLister {
	public static void main(String args[]) {
		File dir = new File("C:\\Files");
		String[] files = dir.list();
		int option;
		for (int fileInList = 0; fileInList < files.length; fileInList++) {
			option = fileInList + 1;
			System.out.println(option + " " + files[fileInList].toString());  
		}
	}
	
	public static void listFiles(String[] arr) {
		int option;
		for (int fileInList = 0; fileInList < arr.length; fileInList++) {
			option = fileInList + 1;
			System.out.println(option + " " + arr[fileInList].toString());  
		}
	}
	
	public static String[] getFilesArrayString() {
		File dir = new File("C:\\Files");
		String[] files = dir.list();
		return files;
	}
	
	public static File[] getFilesArrayFile() {
		File dir = new File("C:\\Files");
		File[] files = dir.listFiles();
		return files;
	}
}