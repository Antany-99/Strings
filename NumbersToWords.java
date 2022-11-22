package Strings;
public class NumbersToWords {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1015;
		int a=n%10,b=n/10,c=b%10,d=b/10,e=d%10,f=d/10,k=n%100;
		if(n<0||n>9999) {System.out.println("Please provide the valid number between 0 t0 9999");}
		else {
			 String g[]= {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen","Twenty"};
			 String h[]= {"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
			 String i="Hundred";
			 String j="Thousand";
			 if(n<20) {System.out.println(g[n]+" ");}
			 else if((n<100)&&(a==0)) {System.out.println(h[b]+" ");}
			 else if((n<100)&&(a!=0)) {System.out.println(h[c]+" "+g[a]);}
			 else if((n<1000)&&((k>9)&&(k<21))) {System.out.println(g[e]+" "+i+" "+g[k]);}
			 else if((n<1000)){System.out.println(g[e]+" "+i+" "+h[c]+" "+g[a]);}
			 else if((n<10000)&&(e==0)&&(k>9)&&(k<21)){System.out.println(g[f]+" "+j+" "+g[e]+" "+h[c]+" "+g[k]);}
			 else if((n<10000)&&(e==0)){System.out.println(g[f]+" "+j+" "+g[e]+" "+h[c]+" "+g[a]);}
			 else if((n<10000)&&(k>9)&&(k<21)){System.out.println(g[f]+" "+j+" "+g[e]+" "+i+" "+h[c]+" "+g[k]);}
			 else{System.out.println(g[f]+" "+j+" "+g[e]+" "+i+" "+h[c]+" "+g[a]);}
		}
	}
}

