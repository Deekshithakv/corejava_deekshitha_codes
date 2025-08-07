package org.tnsif.sf.c2tc.oops;
public class Fooditem {
	
	//properties or state-variable

	String name;
	double price;
	String category;
	
	//behaviour-method
	
	void displayDetails()
	{
		System.out.println("food name -"+ name);
		System.out.println("food price - "+ price);
		System.out.println("food category - "+ category);
		System.out.println(".............................");
	}
	public static void main(String[] args) {
		Fooditem obj = new Fooditem();
		obj.name="burger";
		obj.price=50.6;
		obj.category="fast food";
		
		Fooditem obj1 = new Fooditem();
		obj1.name="pizza";
		obj1.price=300.6;
		obj1.category="fast food";

		obj.displayDetails();
		obj1.displayDetails();
	}

}
