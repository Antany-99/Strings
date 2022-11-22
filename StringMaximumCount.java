package Strings;

import java.util.Scanner;

public class StringMaximumCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String parenthesis=scanner.next();
		char ch[]=parenthesis.toCharArray();
		int open=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='(') {
				open++;
			}
			if(ch[i]==')') {
				open--;
			}
		}
		for(int i=0;i<ch.length;i++) {
			if(open==0) {
				System.out.println(ch[i]);
			}
		}
	}

}
