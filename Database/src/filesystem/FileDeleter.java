package filesystem;

import java.io.File;

public class FileDeleter {
	public static void main(String args[]) {
		File[] files = FileLister.getFilesArrayFile();
		int selection = FileChooser.chooseFile();
		if (selection < files.length) {
			boolean success = files[selection].delete();
			if (success) {
				System.out.println("File successfully deleted");
			} else {
				System.out.println("File NOT deleted");
			}
		} else {
			System.out.println("No such file exists");
		}
	}
	
	public static void deleteFile() {
		File[] files = FileLister.getFilesArrayFile();
		int selection = FileChooser.chooseFile();
		if (selection < files.length) {
			boolean success = files[selection].delete();
			if (success) {
				System.out.println("File successfully deleted");
			} else {
				System.out.println("File NOT deleted");
			}
		} else {
			System.out.println("No such file exists");
		}
	}
}
