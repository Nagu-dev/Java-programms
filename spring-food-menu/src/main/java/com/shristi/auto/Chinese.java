package com.shristi.auto;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
@Component("menu")
public class Chinese implements IFoodMenu {

	public List<String> showItems() {
		List<String> list=Arrays.asList("noodels","maggi","soup");
		System.out.println("the food items are avialable in chinese foof menu are :");
		return null;
	}

//	public void displayMenu(String choice) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	
	

	

	

	
	
	

}
