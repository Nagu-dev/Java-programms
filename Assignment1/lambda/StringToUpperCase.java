package com.assignment.lambda;

import java.util.function.Supplier;

public class StringToUpperCase {

	public static void main(String[] args) {
		Supplier<String>supplier=()->"hello".toUpperCase();
		System.out.println(supplier.get());
		
		
	}

}
