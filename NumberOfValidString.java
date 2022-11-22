package Strings;

public class NumberOfValidString {

	public static void main(String[] args) {
		int n=3;
		int a[]= {1,2,3,4,5,6,7};
		System.out.print("[");
        for(int i=n+1;i<a.length;i++) {
			System.out.print(a[i]+",");}
		for(int j=0;j<=n;j++) {
            if(j<n){
			    System.out.print(a[j]+",");}
            else{
                System.out.print(a[j]+"]");}
        }
	}

}
