package hw;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		File file = new File("TxtFile.txt");

		System.out.println("Version with list:");
		LettersContainerList lc = new LettersContainerList();
		lc.generateMap(file);
		lc.print();

		System.out.println("Version with Map:");
		LettersContainerMap letters = new LettersContainerMap();
		letters.generateMap(file);
		letters.printMap(letters.getLetters());

		System.out.println("END");
	}
}