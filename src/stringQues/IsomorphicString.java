package stringQues;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {

	public static void main(String[] args) {
		String str1 = "dxrdyxnbog";
		String str2 = "ustucsqash";
		System.out.println(areIsomorphic(str1, str2));
	}

	public static boolean areIsomorphic(String str1, String str2) {
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		Map<Character, Character> hashmap = new HashMap<>();
		boolean flag = true;

		if (ch1.length == ch2.length) {
			int i = 0;
			while (i < ch1.length) {
				if (!hashmap.containsKey(ch1[i]) && !hashmap.containsValue(ch2[i]))
					hashmap.put(ch1[i], ch2[i]);

				else if (hashmap.containsKey(ch1[i]) && !hashmap.containsValue(ch2[i])) {
					flag = false;
					return flag;

				} else if (!hashmap.containsKey(ch1[i]) && hashmap.containsValue(ch2[i])) {
					flag = false;
					return flag;
				}

				i++;
			}

		}
		return flag;

	}

}
