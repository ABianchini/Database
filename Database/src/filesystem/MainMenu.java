package filesystem;

import java.io.IOException;
import java.util.Scanner;

public class MainMenu {
	public static void main(String args[]) throws IOException {
		Scanner in = new Scanner(System.in);
		String password = "star";
		
		System.out.println("Please enter the database password:");
		String passIn = in.nextLine();
		if(passIn.equals(password)) {
			System.out.println("Enter menu selection:\n1 Create File\n2 Open File\n3 Edit File\n4 Delete File\n5 Exit");
			menuLoop:
			while (true) {
				int menuChoice = in.nextInt();
				switch (menuChoice) {
				case 1:
					FileCreator.createFile();
					break;
				case 2:
					FileViewer.viewFile();
					break;
				case 3:
					FileEditor.editFile();
					break;
				case 4:
					FileDeleter.deleteFile();
					break;
				case 5:
					break menuLoop;
				}
				System.out.println();
				System.out.println("Enter menu selection:\n1 Create File\n2 Open File\n3 Edit File\n4 Delete File\n5 Exit");
			}
		} else {
			System.out.println("Access Denied");
		}
	}
}