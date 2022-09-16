package Strings;

public class RevVowels {
	public static void main(String[] args) {
		String str = "Abcdefghi";
		char[] ch=str.toCharArray();
		String rev="";
		char temp;
		for(int i=0;i<ch.length;i++) {
			for(int j=ch.length-1;j>0;j--) {
				if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u'||ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U') {
					if(ch[j]=='a' || ch[j]=='e' || ch[j]=='i' || ch[j]=='o' || ch[j]=='u'||ch[j]=='A' || ch[j]=='E' || ch[j]=='I' || ch[j]=='O' || ch[j]=='U') {
						temp=ch[i];
						ch[i]=ch[j];
						ch[j]=temp;}
			}
		}
	}
			for(int i=0;i<ch.length;i++) {
				rev=rev+ch[i];}
			System.out.println(rev);}
}
