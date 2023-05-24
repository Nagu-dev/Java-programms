package com.assignment.interfac;

class InterfaceMain {

	public static void main(String[] args) {
		Calculator calculator =(x,y) ->{
			return x + y;
		};
System.out.println("addition :"+calculator.calculate(2,3));

calculator =(x,y) -> {
	
	return x - y;
};
System.out.println("subtraction :"+calculator.calculate(9,6));

calculator =(x,y) -> {
	
	return x * y;
};
System.out.println("multiplication :"+calculator.calculate(20,30));
	
	calculator =(x,y) -> {
		
		return x/y;
	};
	System.out.println("division :"+calculator.calculate(62,4));
		}

}
