package Strings;

public class number {
	public static void main(String[] args) {
	int n=1000;
	int Last=n%10,Remain1=n/10,SecondLast=Remain1%10,Remain2=Remain1/10,ThirdLast=Remain2%10,Remain3=Remain2/10,LastTwo=n%100;
	if(n<0||n>9999) {System.out.println("Please provide the valid number between 0 t0 9999");}
	else {
		 String Ones[]= {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen","Twenty"};
		 String Twos[]= {"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
		 String Threes="Hundred";
		 String Fours="Thousand";
		 if(n<20) {System.out.println(Ones[n]+" ");}
		 else if((n<100)&&(Last==0)) {System.out.println(Twos[Remain1]+" ");}
		 else if((n<100)&&(Last!=0)) {System.out.println(Twos[SecondLast]+" "+Ones[Last]);}
		 else if((n<1000)&&((LastTwo>9)&&(LastTwo<21))) {System.out.println(Ones[ThirdLast]+" "+Threes+" "+Ones[LastTwo]);}
		 else if((n<1000)){System.out.println(Ones[ThirdLast]+" "+Threes+" "+Twos[SecondLast]+" "+Ones[Last]);}
		 else if((n<10000)&&(ThirdLast==0)&&(LastTwo>9)&&(LastTwo<21)){System.out.println(Ones[Remain3]+" "+Fours+" "+Ones[ThirdLast]+" "+Twos[SecondLast]+" "+Ones[LastTwo]);}
		 else if((n<10000)&&(ThirdLast==0)){System.out.println(Ones[Remain3]+" "+Fours+" "+Ones[ThirdLast]+" "+Twos[SecondLast]+" "+Ones[Last]);}
		 else if((n<10000)&&(LastTwo>9)&&(LastTwo<21)){System.out.println(Ones[Remain3]+" "+Fours+" "+Ones[ThirdLast]+" "+Threes+" "+Twos[SecondLast]+" "+Ones[LastTwo]);}
		 else{System.out.println(Ones[Remain3]+" "+Fours+" "+Ones[ThirdLast]+" "+Threes+" "+Twos[SecondLast]+" "+Ones[Last]);}
		}
	}
}
