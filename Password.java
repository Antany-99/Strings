package Strings;
import java.util.*;
public class Password {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=1;
		System.out.println("Enter the Password");
		while(n>0) {
			String Pass=s.nextLine();
			int Small=0,Capital=0,Special=0,num=0;
			for(int i=0;i<Pass.length();i++) {
				if((Pass.charAt(i)>='A')||(Pass.charAt(i)<='Z')) {Capital++;}
				if((Pass.charAt(i)>='a')||(Pass.charAt(i)<='z')) {Small++;}
				if((Pass.charAt(i)>=33)||(Pass.charAt(i)<=47)||(Pass.charAt(i)>=58)||(Pass.charAt(i)<=64)) {Special++;}
				if((Pass.charAt(i)>=48)||(Pass.charAt(i)<=57)) {num++;}
			}
			if((Small>4)&&(Capital>0)&&(Special>0)&&(num>0)&&(Pass.length()>=8)) {
				System.out.println("Strong Password");n--;}
			else if((Small>4)&&(Capital>0)&&(Special>0)&&(num>0)&&(Pass.length()>=6)) {
				System.out.println("Moderate Password");n--;}
			else {System.out.println("The Password is Weak,Please enter the Strong Password");}
			}
		}
	}
