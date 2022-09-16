package Strings;

public class PrintMismatch {
	public static void main(String args[]) {
		String s1="abcd";
	    String s2="cbdae";
	    char a[]=s1.toCharArray();
	    char b[]=s2.toCharArray();
	    a:for(int i=0;i<b.length;i++){
	      b:  for(int j=0;j<a.length;j++){
	          if(b[i]==a[j]){
	              continue a;}
	        }
	        System.out.println("Extra Element is :"+b[i]);}
		}
}
