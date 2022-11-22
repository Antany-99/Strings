package Strings;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
public class StringFreq {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		 Map<Character,Integer> map = new HashMap<Character,Integer>();
		    System.out.println("Enter the String");
		    String s=scan.next();
		    char[] ch = s.toCharArray();
		    for(char c : ch) {
		    	if(map.containsKey(c)) {	
		    		map.put(c,map.get(c)+1); }
		    	else {
		    		map.put(c,1);}
		    }
		    System.out.println(map);
		    System.out.println("this element is not present : ");
		    Set<Entry<Character,Integer>> entrySet = map.entrySet();
		    for(Entry<Character,Integer> iterate : entrySet) {
		    	if(iterate.getValue()==0) {
		    		System.out.println(iterate.getKey());}
		    	}
		    }
}













