package Strings;

public class PolynomialString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[]={"Antany","Asia","Anansiya"};
		String a="";
		int n=s.length;
			String c=s[0];
			String d=s[1];
			String e=s[2];
		for(int i=0;i<c.length();i++) {
			b:for(int j=i;j<d.length();j++) {
				for(int k=i;k<e.length();k++) {
					if(c.charAt(i)==d.charAt(j) && d.charAt(j)==e.charAt(k) && e.charAt(k)==c.charAt(i)) {
						a+=c.charAt(i);}
					break b;
				}
			}
		}
		System.out.println(a);
	}

}
