package crackingcode.strings_arrays;

import java.util.HashSet;
import java.util.Set;

public class One_One {

	private boolean contains(char[] seen, int last) {
		for (int i = 0; i < last; i++)
			if (seen[last] == seen[i])
				return true;

		return false;
	}

	public boolean isUniqueP(String str) {
		for (int i = 0; i < str.length(); i++)
			if (contains(str.toCharArray(), i))
				return false;

		return true;
	}

	public boolean isUnique(String str) {
		Set<Character> set = new HashSet<>();
		for (Character ch : str.toCharArray())
			if (set.add(ch) == false)
				return false;

		return true;
	}
}
