package com.assignment.lambda;

import java.util.function.BiConsumer;

public class Admin {

	public static void main(String[] args) {
		BiConsumer<String, Integer> biConsumer2 = (str, age) -> {

			if (age > 30 && str=="admin")
				System.out.println("welcome  admin" );
			else
				System.out.println("wrong user");
		};
		biConsumer2.accept("admin", 35);

	}

}
