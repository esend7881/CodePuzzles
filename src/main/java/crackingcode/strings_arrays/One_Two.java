package crackingcode.strings_arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class One_Two {

	public boolean isPerm(String str1, String str2) {

		Map<Character, Integer> map1 = fillMap(str1);
		Map<Character, Integer> map2 = fillMap(str2);

		return map1.equals(map2);
	}

	private Map<Character, Integer> fillMap(String str) {
		Map<Character, Integer> map = new HashMap<>();
		for (Character ch : str.toCharArray()) {
			Integer prev = map.get(ch);
			map.put(ch, prev == null ? 1 : prev + 1);
		}
		return map;
	}

	public boolean isPerm2(String str1, String str2) {
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		// return ch1.hashCode() == ch2.hashCode();
		return Arrays.equals(ch1, ch2);
	}
}
