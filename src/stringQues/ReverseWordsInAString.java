package stringQues;

public class ReverseWordsInAString {

	public static void main(String[] args) {
		String str = "Welcome   to Coding Ninjas"; // star a am I
		System.out.println(reverseString(str));
	}

	public static String reverseString(String str) {
		String[] strArray = str.split(" ");
		int size = strArray.length - 1;

		StringBuilder sb = new StringBuilder();
		int i = size;
		while (i >= 0) {
			
			if (!strArray[i].isBlank()) {
				sb.append(strArray[i]);
				sb.append(" ");
				
			}
			i--;

		}
		String reversed = new String(sb);
		

		return reversed.trim();
	}

}
