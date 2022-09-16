package Strings;
public class AlphabetNum {
	public static void main(String args[]) {
		String S="CDA";
	char a[]=S.toCharArray();
	int b=0;
	for(int i=0;i<a.length;i++) {
		b=a[i]-65+1;
		System.out.print(b);}
	}
}
