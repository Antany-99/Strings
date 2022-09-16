package Strings;

public class RemoveUnbalanceParanthesis {
	public static void main(String args[]) {
		String s="(abc)(de))";
		char a[]=s.toCharArray();
		int n=s.length();
		int open=0,close=0,start,end;
		for(start=0,end=n-1;start<n;start++,end--) {
			if(a[start]=='(') {
				open++;}
			else if(a[start]==')') {
				open--;}
			if(a[end]==')') {
				close++;}
			else if(a[end]=='(') {
				close--;}
			if(open<0) {
				a[start]=(char) -1;
				open=0;}
			if(close<0) {
				a[end]=(char)-1;
				close=0;}}
		for(int i=0;i<a.length;i++) {
			if(a[i]!=-1) {
				System.out.print(a[i]);}
		
		}
	}
}
