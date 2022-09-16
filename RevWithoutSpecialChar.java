package Strings;
public class RevWithoutSpecialChar {
	public static void main(String[]args) {
		String s="C@mel";
		char a[]=s.toCharArray();
		int b=s.length()-1,c=0;
		while(c<b) {
			if (!Character.isAlphabetic(a[c])) {
                c++;}
            else if(!Character.isAlphabetic(a[b])) {
                b--;}
			else {
				char tmp=a[c];
				a[c] = a[b];
				a[b]=tmp;
				c++;
				b--;}
			}
			String d = new String(a);
	        System.out.print(d+" ");}
}
