package filesystem;

import java.util.Scanner;

public class FileChooser {
	
	public static int chooseFile()  {
		Scanner in = new Scanner(System.in);
		String[] files = FileLister.getFilesArrayString();
		FileLister.listFiles(files);
		System.out.println(">Enter a file number");
		int selection = in.nextInt() - 1;
		return selection;
	}
}
