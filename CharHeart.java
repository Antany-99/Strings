package Strings;
public class CharHeart {
	public static void main(String[] args) {
		String Name="Talk";
		int Length=Name.length(),Space,a=0,b=0,u=0,Square=Length*Length;
		a:for(int i=0;i<(Length*2)-1;i++) {
			Space=i*(Length/2);a++;
			if(i==(Length*2)-2) {Space=(i-1)*(Length/2);a--;}
			for(int j=Square;j>Space;j--) {
				System.out.print(" ");}
			for(int x=0;x<(a*Length);x++){
				if(i<2) {continue a;}
				else if((i==3)&&(x>Length-1)&&(x<(a*Length)-Length)) {
					System.out.print(" ");}
				else if((i==4)&&(x>(Length*2)-1)&&(x<(a*Length)-(Length*2))) {
					System.out.print(" ");}
				//else if((i==5)&&(x==(Length*3))) {
				//	System.out.print("  ");}
				else{System.out.print(Name.charAt(x%Length));}
			}
			System.out.println();}
		for(int i=2;i<=Length*2;i++) {
			Space=i*(Length/2);
			if(i==Length*2) {Space-=1;}
			for(int j=0;j<Space+(Length/2);j++) {
				System.out.print(" ");}
			for(int x=(a*Length)-u;x>0;x--){
				System.out.print(Name.charAt(b++));
				if(b==Length) {b=0;}
			}
			u+=Length;
			if(i==Length*2) {
				int mid=Length/2;
				System.out.print(Name.charAt(mid-1)+""+Name.charAt(mid));}
			System.out.println();
			
			}
	}
}