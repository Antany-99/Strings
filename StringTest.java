package Strings;

import java.util.*;

public class StringTest {

	public static void main(String[] args) {
		String a="test1234";
		String b="123";
		char c[]=a.toCharArray();
		char d[]=b.toCharArray();
		int count=0;
		List<Character> list=new ArrayList<>(List.of('1','2','3'));
		for(int i=0;i<c.length;i++) {
			if(list.contains(c[i])) {
				count++;}
		}
		if(count==b.length()) {
			System.out.println("Valid");}
		else {
			System.out.println("Invalid");}
	}
	

}
