package hw;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LettersContainerList {
	private List<LetterClass> letters = new ArrayList<LetterClass>();

	public List<LetterClass> getLetters() {
		return letters;
	}

	public void setLetters(List<LetterClass> letters) {
		this.letters = letters;
	}

	public void addLetter(char ch) {
		if (letters.size() > 0) {
			for (int i = 0; i < letters.size(); i++) {
				if (letters.get(i).getLetter() == ch) {
					letters.get(i).setCounter(letters.get(i).getCounter() + 1);
					return;
				}
			}
			letters.add(new LetterClass(ch, 1));
		} else {
			letters.add(new LetterClass(ch, 1));
		}
	}

	public void generateMap(File file) {
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			int readed;
			char ch;
			while ((readed = br.read()) != -1) {
				if (Character.isLetter((char) readed)) {
					ch = Character.toUpperCase((char) readed);
					this.addLetter(ch);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void print() {
		letters.sort(Comparator.nullsLast(new CompareLettersByCounter()));
		if (letters.size() > 0) {
			for (LetterClass lc : letters) {
				System.out.println(lc.getLetter() + " -> " + lc.getCounter());
			}
		} else {
			System.out.println("List is empty");
		}
	}
}
