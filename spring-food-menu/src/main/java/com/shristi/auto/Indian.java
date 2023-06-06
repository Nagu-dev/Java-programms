package com.shristi.auto;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component
public class Indian implements IFoodMenu {

	public List<String> showItems() {
		List<String> list = Arrays.asList("chicken", "fish", "prawn","idli");
		System.out.println("the food items in idian menu are :");
		return list;

	}

}
