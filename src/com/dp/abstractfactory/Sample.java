package com.dp.abstractfactory;


public class Sample {
	
	public static void main(String[] args) {
		
		String s1= new String("Aswani");
		String s2= new String("Aswani");
		String s3= "Aswani";
		
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s1 == s3);
		System.out.println(s1 == s2);
		
	}
	
	

}
