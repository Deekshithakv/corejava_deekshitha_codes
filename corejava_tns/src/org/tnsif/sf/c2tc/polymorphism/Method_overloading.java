package org.tnsif.sf.c2tc.polymorphism;

class Calculator{
	int add(int a,int b) {
		return a+b;
	}
	double add(double a,double b) {
		return a+b;
	}
	int add(int a,int b,int c) {
		return a+b+c;
	}
	
	
}

public class Method_overloading {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println("add(double,double)->"+cal.add(3,4));
		System.out.println("add(int,int,int)->"+cal.add(1,4,9));
		System.out.println("add(int,int)->"+cal.add(1,9));

	}

}
