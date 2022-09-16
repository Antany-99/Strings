package Strings;

public class StringValidInvalid {
	public static void main(String[] args) {
		String s1="127";
        char a[]=s1.toCharArray();
        a:for(int i=0;i<s1.length();i++){
                if(!(a[i]>='0' && a[i]<='9')){
                    System.out.print("Invalid");
                    break a;}
                else{
                    if(i==s1.length()-1){
                        System.out.print("valid");}
                }
            }
	}
}
