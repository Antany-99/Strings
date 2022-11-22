package Strings;

import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int rn = (int)Math.floor(Math.sqrt(n));
        int cn = (int)Math.ceil(Math.sqrt(n));
        while(cn>rn){
            cn--;
            if((cn*rn)<n){
                cn++;
                break;}
        }
        while((cn*rn)<n && (cn>rn)){
            rn++;}
        for(int i =0;i<cn;i++){     
            int row = 0;
            while(row<=rn-1){
                if((i+row*cn)<n){
                    System.out.print(s.charAt(i+row*cn)); 
                     row++;}     
                else{
                    break;}        
            }
            System.out.print(" ");
        }

	}

}
