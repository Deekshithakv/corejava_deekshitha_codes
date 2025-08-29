package org.tnsif.sf.c2tc.Final;

class upi{
	final int max_daily_limit = 100000;
	
	void showlimit() {
		System.out.println("transfer limit "+ max_daily_limit);
	}
}

public class Final_variable {

	public static void main(String[] args) {
		upi obj = new upi();
		obj.showlimit();

	}

}
