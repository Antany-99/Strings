package Strings;

public class ZigZag {
	public static void main(String[] args) {
		String s= "Zoho";
		int n=2;
		System.out.println(convert(s,n));
	}

	 public static String convert(String s, int numRows) { 
	        if (numRows==1) {
	            return s;}
	         
	        StringBuilder result=new StringBuilder();
	        for (int i = 0; i < numRows; i++) {
	            for (int j=0;j+i<s.length();j+=numRows*2-2) {
	                result.append(s.charAt(j+i));
	                if (i!=0 && i!=numRows-1 && j+numRows*2-2-i < s.length()) {
	                    result.append(s.charAt(j+numRows*2-2-i));
	                }
	            }
	        }
	        return result.toString();
	    }
}
