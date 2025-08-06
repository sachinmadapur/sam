package javaprogram;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class programs {
@Test
public void reverseString() {
	/*
	 * approach =1
	 * String s ="Sachin";
	String rev ="";
	for(int i=s.length()-1; i>=0; i--) {
	  char ch = s.charAt(i);
	  rev = rev + ch;
	}
	System.out.println(rev);
}*/
	/* approach =2
	StringBuffer f	 = new StringBuffer("Sachin");
	System.out.println("reverse==> "+ f.reverse());
	*/
	/* approach =3
	StringBuilder f	 = new StringBuilder("Sachin");
	System.out.println("reverse==> "+ f.reverse());
	*/
	/* approach =4
	String s ="Sachin";
	char[] ch = s.toCharArray();
	String rev ="";
	for(int i=ch.length-1; i>=0; i--) {
		rev = rev + ch[i];
	}
	System.out.println(rev);
	*/
	
}
@Test
public void reversePalindromeString() {
	String s ="mom";
	String rev ="";
	for(int i=s.length()-1; i>=0; i--) {
		char ch = s.charAt(i);
		rev = rev + ch;
	}
	if(s.equalsIgnoreCase(rev)) {
		System.out.println("palindrome");
	}
	else
		System.out.println("not a palindrome");
}

@Test
public void reverseStringwithoutReverseSpace() {
	String s ="i am sachin";
	String s1 = s.replace(" ", "");
	int index = s1.length()-1;
	
	for(int i=0; i<s.length(); i++) {
		if(s.charAt(i)==' ') {
			System.out.print(" ");
		}
		else
			System.out.print(s1.charAt(index--));
	}
}
@Test
public void reverseEachWords() {
	String s="hey am sachin";
	String [] words = s.split(" ");
	String output ="";
	for(String word:words) {
		String rev ="";
		for(int i=word.length()-1; i>=0; i--) {
			rev = rev + word.charAt(i);
			}
		output = output + rev +" ";
		}
	System.out.println("output "+output);
}
@Test
public void frequency() {
	String s ="aabbabac";
	LinkedHashMap<Character, Integer> hash = new LinkedHashMap();
	for(int i=0; i<s.length(); i++) {
		char ch = s.charAt(i);
		if(hash.containsKey(ch)) {
			hash.put(ch, hash.get(ch)+1);
		}
		else {
			hash.put(ch, 1);
		}
	}
	System.out.println(hash);

}
@Test
public void frequency_unique() {
	String s ="aabbabace";
	LinkedHashMap<Character, Integer> hash = new LinkedHashMap();
	for(int i=0; i<s.length(); i++) {
		char ch = s.charAt(i);
		if(hash.containsKey(ch)) {
			hash.put(ch, hash.get(ch)+1);
		}
		else {
			hash.put(ch, 1);
		}
	}
   for(Entry<Character, Integer> map :hash.entrySet()) {
	   if(map.getValue()==1) {
		   System.out.println(map.getKey()+ "  < =========== unique value");
	   }
   }
}
@Test
public void remove_dublicates() {
	String s ="aabbbabac";
	LinkedHashSet<Character> set = new LinkedHashSet<Character>();
	for(int i=0; i<s.length(); i++) {
		set.add(s.charAt(i));
	}
	System.out.println(set);
}
@Test
public void count_ch_num_sy() {
	String s="abcd123##@!";
	int alpha = 0, num =0 ,sym =0;
	for(int i=0; i<s.length(); i++){
		char ch = s.charAt(i);
		if(ch>='1' && ch<='9') {
			num++;
		}
		else if (ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
			alpha++;
		}
		else {
			sym++;
		}
	}
	System.out.println("alpabet ===> "+alpha);
	System.out.println("number ===> "+ num);
	System.out.println("symbol ====> "+sym);

}
@Test
public void count_space() {
	String s="This is a sample string with spaces 123 !!";
	int space=0;
	for(int i=0; i<s.length(); i++){
		char ch = s.charAt(i);
		if(ch == ' ') {
			space++;
		}
		
	}
	System.out.println("space :"+ space);
}
@Test
public void sum() {
	String s ="aab1234";
	int sum=0;
	for(int i=0; i<s.length(); i++) {
		char ch = s.charAt(i);
		if(ch>='1' && ch<='9') {

		sum =sum + ch - 48;
	}
}
	System.out.println(sum);
}
@Test
public void swap() {
	String s1="raj";
	String s2="sam";
	System.out.println("After string ");
	s1 = s1 + s2;
	s2 = s1.substring(0, s1.length()-s2.length());
	s1 = s1.substring(s2.length());
	System.out.println(s1);
	System.out.println(s2);
}
@Test
public void compressString() {
	String s="aaabbsseerrrr";
	int count =1;
	
	for(int i=0; i<s.length()-1; i++) {
		if(s.charAt(i)==s.charAt(i+1)) {
			count++;
		}
		else
		{
			System.out.print(s.charAt(i)+""+ count);
					count=1;
		}
	}
	    System.out.print(s.charAt(s.length()-1) +""+count);
}
@Test
public void convert_Uppercase() {
	String s="aaabbsseerrrr";
	System.out.println("uppercase : "+s.toUpperCase());
}
@Test
public void expandString() {
	String s = "a2b2a1c1";
	
}
}
