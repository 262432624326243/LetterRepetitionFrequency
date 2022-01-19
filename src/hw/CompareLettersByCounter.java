package hw;

import java.util.Comparator;

public class CompareLettersByCounter implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		LetterClass l1 = (LetterClass) o1;
		LetterClass l2 = (LetterClass) o2;
		if (l1.getCounter() > l2.getCounter()) {
			return -1;
		} else if (l1.getCounter() < l2.getCounter()) {
			return 1;
		}
		return 0;
	}
}