package Strings;
import java.util.*;
public class StringPermute
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter The First String");
		String s1=scan.next();
		char ch1[]=s1.toCharArray();
		System.out.println("Enter The Second String");
		String s2=scan.next();
		char ch2[]=s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		boolean flag=true;
		for(int i=0;i<ch1.length;i++){
			if(ch1[i]==ch2[i]) {
				flag=true;
			}
			else {
				flag=false;
			}
        }
        System.out.println(flag);
	}
}

