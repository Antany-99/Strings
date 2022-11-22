package Strings;

public class Heart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Name="Antany";
		int Length=Name.length(),n,m=0,l=0;
		for(int i=0;i<Length*2;i++) {
			n=i*3;l++;
			for(int j=i+1;j<Length*Length;j++) {
				System.out.print(" ");}
			for(int x=l*Length;x>n;x--){
				System.out.print(Name.charAt(x));
			}
			System.out.println();}
	}

}
