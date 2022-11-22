package Strings;
public class WordPattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Antuany";
		int mid=0;
		for(int i=0;i<s.length();i++) {
			if(s.length()%2!=0) {
				mid=s.length()/2;
				if(i<mid) {
					for(int j=0;j<(s.length()-(mid+i));j++) {
						System.out.print(s.charAt(i));}
				}
				else {
					for(int j=(s.length()+(mid-i));j<=s.length();j++) {
						System.out.print(s.charAt(i));}
				}
			}
			else {
				mid=s.length()/2;
				if(i<mid) {
					for(int j=0;j<(s.length()-(mid+i));j++) {
						System.out.print(s.charAt(i));}
				}
				else {
					for(int j=(s.length()+(mid-i));j<=s.length();j++) {
						System.out.print(s.charAt(i));}
				}
			}
			
		}
	}

}
