package com.graymatter;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class DemoOnStrings {
	
	public static void main(String args[])
	{
		String str="Hello";
		System.out.println(str.hashCode());
		str="Hello.";
		System.out.println(str.hashCode());
		String s1 = new String("Hello");
		System.out.println(s1.hashCode()); //refers to the previous values assigned
		
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		String s2=s1;
		s2=s2+"world";
		String s="Hello";
		System.out.println(s.equals(s1)); // checks both value and reference
		System.out.println(s==s1); // checks value
		System.out.println(s.trim());
		System.out.println(s.replace('H', 'c'));
		
		s="apple";
		s1="ball";
		System.out.println(s.compareTo(s1)); //-ve no - s first string comes first in dict order------ +ve s1-second str comes first in dict order
		System.out.println(s.endsWith("ple"));
		System.out.println(s.isBlank()); //is blank or has white spaces
		System.out.println(s.isEmpty()); //if length()is 0
		s="   ";
		System.out.println(s.isBlank()); 
		System.out.println(s.isEmpty());
		
		StringBuffer sbf= new StringBuffer("hello"); 
		//StringBuffer sbf= new StringBuffer(59)); //to change the capacity of the buffer
		StringBuffer sbf1= new StringBuffer("hello"); // creates another buffer
		System.out.println(sbf.hashCode());
		System.out.println(sbf1.hashCode());
		sbf.append("dhanya");
		System.out.println(sbf.hashCode());
		s=sbf.toString(); //convert to string repr
		System.out.println(		sbf.capacity());
		checkNames();
		splitString();

	}
	
	public static void checkNames()
	{
		String[] arr= {"ann","snn","sdd"};
		for(String q:arr)
			if(q.startsWith("s")) //q.charAt(0)=='s'
				System.out.println(q);
		
	}
	
	public static void splitString()
	{
		String para="hello this is dhanya";
		String parr[]= para.split(" "); //creates tokens-machine understandable words
		for(String q:parr)
			System.out.println(q);
		
		String joiner="";
		for(String q:parr)
			joiner+=q+" ";
		System.out.println(joiner);
		
		StringTokenizer tokenizer = new  StringTokenizer(para," ");
		while (tokenizer.hasMoreTokens())
			System.out.println(tokenizer.nextToken());
		
		StringJoiner sjoiner =new StringJoiner(",");
		sjoiner.add("apple");
		sjoiner.add("apple");
		sjoiner.add("apple");
		System.out.println(sjoiner);

				
		

	}

}
