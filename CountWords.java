package Strings;
public class CountWords {
	public static void main(String[] args) {
		String s1 = "One two @ Six three\nfour \tfive";
		String s = s1 + " ";
		String n = "";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) >= 65 && s.charAt(i) <= 91) || (s.charAt(i) >= 97 && s.charAt(i) <= 122)) {
				n = n + s.charAt(i);}
			else {
				if (n.length() > 0) {
					count++;}
				n = "";}
		}
		System.out.println("Number of words : " + count);}
}
