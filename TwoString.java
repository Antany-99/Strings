package Strings;

public class TwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="mom";
		String b="dad";
		for(int i=0;i<a.length();i++) {
			int c=a.charAt(i)-96;
			int d=b.charAt(i)-96;
			char e=(char)(c+d+96);
			if(e>=97 && e<=122) {
				System.out.print(e);
			}
			else if(e>122) {
				System.out.print((char)(e-122+96));
			}
		}
	}

}
