package org.tnsif.sf.c2tc.Final;
//ecommerce discount calculation

class EcommercePlatform
{
	 void calculateDiscount()
	{
		System.out.println("Base discount =10%");
	}
}
class Amazon extends EcommercePlatform
{
	final void calculateDiscount()
	{
	    System.out.println("Extra Discount =20%");	
	}
}

public class Finalmethod {

	public static void main(String[] args) {
		Amazon obj=new Amazon();
		obj.calculateDiscount();

	}

}
