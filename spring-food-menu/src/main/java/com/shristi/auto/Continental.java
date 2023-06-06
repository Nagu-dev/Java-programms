package com.shristi.auto;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class Continental implements IFoodMenu {

	public List<String> showItems() {
		List<String> list=Arrays.asList("periperi","BBQ");
		System.out.println("the food items are avilable in continental menu are :");
		return list;
	}


	

}
