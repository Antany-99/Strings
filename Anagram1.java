package Strings;

import java.util.Arrays;

public class Anagram1 {
	public static void main(String args[]) {
		String s[]= {"catch","got","tiger","mat","tea","pat","tap","eat"};
		String n[]=s.clone();
		for(int i=0;i<s.length;i++) {
			char a[]=s[i].toCharArray();
			//Ascendingorder(a,a.length);
			Arrays.sort(a);
			s[i]=new String(a);
			}
		for(int i=0;i<s.length;i++) {
			for(int j=i+1;j<s.length;j++)
				if(s[i].equals(s[j]))
					System.out.println(n[i]+" "+"and"+" "+n[j]);}
		}
//		static  int Ascendingorder(char a[],int n) {
//			char temp=0;
//			for(int i=0;i<n;i++) {
//				for(int j=i+1;j<n;j++) {
//					if(a[i]<a[j]) {
//						temp=a[i];
//						a[i]=a[j];
//						a[j]=temp;}
//					}
//				}
//			return temp;
//			}
}
