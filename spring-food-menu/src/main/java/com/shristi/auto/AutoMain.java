package com.shristi.auto;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutoMain {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.shristi.auto");
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		Resturant resturant = context.getBean("resturant", Resturant.class);

		resturant.displayMenu("chinese");
		resturant.displayMenu("indian");
		resturant.displayMenu("continental");

	}
}