package com.mobileapp.client;

import java.util.Scanner;

import com.mobileapp.model.Mobile;
import com.mobileapp.service.MobileService;
import com.mobileapp.service.MobileSrviceImpl;
import com.mobileapp.service.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MobileService mobileService = new MobileSrviceImpl();
		System.out.println("all mobile details");
		Mobile[] mobile = mobileService.getAll();
		for (Mobile mobiles : mobile) {
			System.out.println(mobiles);
		}

		try {
			System.out.println("enter the id");
			int id = sc.nextInt();
			Mobile mobileid = mobileService.getById(id);
			System.out.println("mobile by id is");
			System.out.println(mobileid);

			System.out.println("enter the brand");
			String brand = sc.next();
			Mobile[] mobilebrand = mobileService.getByBrand(brand);

			for (Mobile mobilebybrand : mobilebrand) {
				System.out.println(mobilebybrand);
			}
		}
		catch(MobileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
