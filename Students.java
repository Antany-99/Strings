package Strings;


import java.util.*;
import java.util.Map.Entry;
import java.util.*;
public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>s1=new ArrayList(List.of(30,43,85,100,90));
		List<Integer>s2=new ArrayList(List.of(90,95,92,93,99));
		List<Integer>s3=new ArrayList(List.of(55,63,72,37,88));
		List<Integer>s4=new ArrayList(List.of(71,58,98,45,50));
		List<Integer>s5=new ArrayList(List.of(41,92,46,54,73));
		List<Integer>s6=new ArrayList(List.of(74,44,95,86,83));
		List<Integer>s7=new ArrayList(List.of(65,94,74,99,65));
		List<Integer>s8=new ArrayList(List.of(25,64,75,32,89));
		List<Integer>s9=new ArrayList(List.of(42,67,74,94,56));
		List<Integer>s10=new ArrayList(List.of(65,45,74,65,85));
		
		List<List<Integer>>school=new ArrayList(List.of(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10));
		Map<Character,Integer>map=new HashMap();
		map.put('S',0);
	       map.put('A',0);
	       map.put('B',0);
	       map.put('C',0);
	       map.put('D',0);
	       map.put('U',0);
	       
	       for(int i=0; i<school.size(); i++) {
	       
	       for(int j=0; j<school.get(i).size(); j++) {
	       
	       if(school.get(i).get(j)>=91 && school.get(i).get(j)<=100){
	       int gradeS = map.get('S')+1;
	       map.put('S',gradeS);
	       }
	       else if(school.get(i).get(j)>=81 && school.get(i).get(j)<=90) {
	       int gradeA = map.get('A')+1;
	       map.put('A',gradeA);
	       }
	       else if(school.get(i).get(j)>=71 && school.get(i).get(j)<=80) {
	       int gradeB = map.get('B')+1;
	       map.put('B',gradeB);
	       }
	       else if(school.get(i).get(j)>=61 && school.get(i).get(j)<=70) {
	       int gradeC = map.get('C')+1;
	       map.put('C',gradeC);
	       }
	       else if(school.get(i).get(j)>=51 && school.get(i).get(j)<=60) {
	       int gradeD = map.get('D')+1;
	       map.put('D',gradeD);
	       }
	       else {
	       int gradeU = map.get('U')+1;
	       map.put('U',gradeU);
	       }
	       }
	       }
	       
	       char c=' ';
	       int max=0;
	       Set<Entry<Character,Integer>> entrySet = map.entrySet();
	       for(Entry<Character,Integer> iterate : entrySet) {
	       System.out.println(iterate.getKey()+" Grade - "+iterate.getValue());
	        if(max<iterate.getValue()) {
	        max=iterate.getValue();
	        c=iterate.getKey();
	        }
	       }
	       System.out.println(c+" Grade is the maximum count :"+max);
		}
	}
