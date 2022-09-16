package Strings;

public class A11B22C33 {
	public static void main(String[]args) {
		String input = "a11b25c15";
				String num="";
				char letter=' ';
				for (char c : input.toCharArray()) {
					if(!(c>='0' && c<='9')) {		
						if(num!="") {
						int n=Integer.parseInt(num);
						for(int i=0;i<n;i++) {
							System.out.print(letter);}
						}
						letter=c;
						num="";}
					else {
						num=num+c;}
				}
				int n=Integer.parseInt(num);
				for(int i=0;i<n;i++) {	
					System.out.print(letter);}
		}
}
