package hw;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import java.util.Map;

public class LettersContainer {
	private Map<Character, Integer> letters = new HashMap<Character, Integer>();

	public LettersContainer() {
		super();
	}

	public Map<Character, Integer> generateLettersMap(File file) {
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			Character readed;
			while ((readed = (char) br.read()) != null) {
				if (letters.containsKey(readed)) {
					letters.put(readed, letters.get(readed) + 1);
				} else {
					letters.put(readed, 1);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return letters;
	}
}
