package Strings;

public class Anagram {

	public static void main(String[] args) {
		int a=20,b=23,k=6;
		int d=0,count=0;
        for(int i=a;i<=b;i++){
            int c=i,r=0;
            while(c!=0){
                r=r*10+(c%10);
                c/=10;
            }
            if(r>=i){
                d=r-i;}
            else if(r<i){
                d=i-r;}
            if(d%k==0){
                count++;}
            
        }
	    System.out.println(count);

	}

}
