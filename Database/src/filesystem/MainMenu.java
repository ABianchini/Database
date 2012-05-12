package filesystem;

import java.io.IOException;
import java.util.Scanner;

public class MainMenu {
	public static void main(String args[]) throws IOException {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter menu selection:\n1 Create File\n2 Open File\n3 Edit File\n4 Exit");
		
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
				break menuLoop;
			}
			System.out.println("Enter menu selection:\n1 Create File\n2 Open File\n3 Edit File\n4 Exit");
		}
	}
}
