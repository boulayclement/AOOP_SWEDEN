package lecture4;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {

	@Override
	public int compare(String a, String b) {
		// return a.length() - b.length();
		return a.compareTo(b);
	}

}
