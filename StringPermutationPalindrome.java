package Strings;
import java.util.*;
public class StringPermutationPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String str1="abc";
		String str2="acb";
		permute(str1,str2,"");
	}
	public static void permute(String str1,String str2,String str3) {
		if(str3.equals(str2)) {
			System.out.println(str2+"=="+str3);
			return;
			}
		for (int i = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i);
	         String str = str1.substring(0, i) + str1.substring(i + 1);
	         permute(str,str2, str3 + ch);
	     }
	}

}
