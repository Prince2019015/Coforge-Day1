package com.coforge;

public class DemoOnStrings {

	public static void main(String[] args) {
		String s1="prince";
		System.out.println(s1);
		System.out.println(s1.hashCode());
		s1="prince kumar";
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		String s2="prince";
		System.out.println(s2.hashCode());
		String s3="prince";
		System.out.println(s3.hashCode());
	}

}