package org.tnsif.sf.c2tc.keywords;

class User{
	int age;
	String name;
	
	User(){
		name = "guest";
		age = 23;
		System.out.println(name +" "+age);
		
		name = "diya";
		age = 21;
		
		System.out.println(name +" "+age);
				
	}
	User(String name,int age){
		this.name = name;
		this.age = age;
		System.out.println("user created:"+name +age);
	}
}

public class Constructor {

	public static void main(String[] args) {
		User obj = new User();
		System.out.println(obj.name +" "+obj.age);
		User obj1 = new User("ganga ",26);

	}

}
