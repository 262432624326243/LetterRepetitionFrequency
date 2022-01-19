package hw;

public class LetterClass {
	private char letter;
	private int counter;

	public LetterClass(char letter, int counter) {
		super();
		this.letter = letter;
		this.counter = counter;
	}

	public LetterClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public char getLetter() {
		return letter;
	}

	public void setLetter(char letter) {
		this.letter = letter;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}
}
