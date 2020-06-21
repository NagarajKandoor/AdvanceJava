package com.methodreference.com;

import java.util.Arrays;
import java.util.Collection;

public class MethodReference {

	public static void main(String[] args) {
		final Collection< String > strings = Arrays.asList( "s1", "s2", "s3" );
		strings.stream().forEach(MethodReference::print);
	}
	
	public static void print(String s) {
		System.out.println(s);
	}

}
