package hw;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		File file = new File("TxtFile.txt");
		Letters letters = new Letters();
		letters.generateMap(file);
		letters.printMap(letters.getLetters());
		System.out.println("After sort:");
		System.out.println("END");
	}
}