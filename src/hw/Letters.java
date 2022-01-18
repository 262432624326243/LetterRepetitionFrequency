package hw;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Letters {
	private Map<Character, Integer> letters = new HashMap<Character, Integer>();

	public Map<Character, Integer> getLetters() {
		return letters;
	}

	public void generateMap(File file) {
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			int readed;
			char ch;
			while ((readed = br.read()) != -1) {
				if (Character.isLetter((char) readed)) {
					ch = Character.toUpperCase((char) readed);
					if (letters.containsKey(ch)) {
						letters.put(ch, letters.get(ch) + 1);
					} else {
						letters.put(ch, 1);
					}
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

	public <K, V> void printMap(Map<K, V> map) {
		Set<K> set = new HashSet<K>();
		set = map.keySet();
		for (K ch : set) {
			System.out.println(ch + " -> " + letters.get(ch));
		}
	}
}
