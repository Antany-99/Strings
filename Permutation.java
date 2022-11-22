package Strings;

public class Permutation {
	public static void main(String[] args) {
        String s = "ABC";
        String s2="BCA";
        int n = s.length();
        Permutation p = new Permutation();
        p.permute(s, 0, n-1,s2); }
    public void permute(String s, int l, int r,String s1){
        if (s1.equals(s)) {
            System.out.print(true);
            return;}
        else {
            for (int i = l; i <= r; i++) {
                s = swap(s,l,i);
                permute(s, l+1, r,s1);
                s = swap(s,l,i);}
        }
    }
    public String swap(String a, int i, int j){
        char temp;
        char[] b = a.toCharArray();
        temp = b[i] ;
        b[i] = b[j];
        b[j] = temp;
        return String.valueOf(b);  }
}




