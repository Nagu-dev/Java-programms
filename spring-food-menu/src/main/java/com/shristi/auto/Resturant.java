package com.shristi.auto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Resturant {

	@Autowired

	IFoodMenu indian;

	@Autowired
	IFoodMenu chinese;

	@Autowired
	IFoodMenu continental;

	public List<String> displayMenu(String choice) {
		List<String> list = new ArrayList();
		if (choice.equalsIgnoreCase("chinese"))
			list = chinese.showItems();
		if (choice.equalsIgnoreCase("indian"))
			list = indian.showItems();
		if (choice.equalsIgnoreCase("continental"))
			list = continental.showItems();
		return list;

	}
}