package com.assignment.lambda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Addition {

	public static void main(String[] args) {
	
Consumer<Integer>consumer=(number)->System.out.println(number+number);
consumer.accept(34);


BiConsumer<Integer, Integer>biconsumer=(num,num1)->System.out.println("addition of two number is "+(num+num1));
biconsumer.accept(25, 56);
}
}
