package Strings;

public class StringCase {

	public static void main(String[] args) {
		String title = "capiTalIze tHe titLe";
		String s=title.toLowerCase();
		String c="";
        int a=0;
        char b[]=s.toCharArray();
        for(int i=0;i<b.length;i++){
            if(b[i]==' '){
                a=0;
            }
            else if(a==0){
                b[i]=(char) (b[i]-32);
                a++;
            }
            c+=b[i];
        }
        System.out.println(c);

	}

}
