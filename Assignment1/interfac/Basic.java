package com.assignment.interfac;

public class Basic  implements BasicCalculator{

	@Override
	public void add(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("addition"+(x+y));
		
	}

	@Override
	public void difference(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("subtraction :"+(x-y));
	}

	@Override
	public void product(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("multiplication :"+(x*y));
	}

	@Override
	public void divide(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("divide :"+(x/y));
	}

}
