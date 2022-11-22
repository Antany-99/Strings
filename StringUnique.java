package Strings;
import java.util.*;
import java.util.Map.Entry;
public class StringUnique{

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in); 
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		String str=scan.next();
		char ch[]=str.toCharArray();
		for(char c : ch) {
	    	if(map.containsKey(c)) {	
	    		map.put(c,map.get(c)+1); }
	    	else {
	    		map.put(c,1);}
		}
		Set<Entry<Character,Integer>> entrySet = map.entrySet();
	    for(Entry<Character,Integer> iterate : entrySet) {
	    	if(iterate.getValue()>1) {
	    		System.out.println(false);
	    		break;}
	    	else {
	    		System.out.println(true);}
	    	}
	}

}
