package Strings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

	public static void main(String[] args) {
		String s="abcabcbb";
		System.out.println(lengthOfLongestSubstring(s));

	}
	 public static int lengthOfLongestSubstring(String s) {
	        int n=s.length();
	        int i=0,j=0,max=0;
	        Set<Character> set = new HashSet<>();
	        for(;j<s.length();){
	            if(set.add(s.charAt(j))){
	                j++;
	                max = Math.max(max, set.size());
	            } 
	            else {
	                set.remove(s.charAt(i));
	                i++;
	            }
	        }
	        return max;
	    }

}
