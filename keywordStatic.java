package com.demo.helloworld;
class staticDemo{
	static int staticVar;
	int var;
	
	public staticDemo() {
		var = 0;
	}
	
	public static void setStaticVar(int x) {
		staticVar = x;
	}
	public void increase () {
		staticVar++;
		var++;
	}
	public void display() {
		System.out.println("Value of static variable: " +staticVar);
		System.out.println("Value of non-static variable: " +var);
	}
}

public class keywordStatic {
	public static void main(String[] args) {
		staticDemo st1 = new staticDemo();
		staticDemo st2 = new staticDemo();
		//increase the static variable two times using s
		st1.increase();
		st1.increase();
		st1.display();
		//increase the static variable three times using
		st2.increase();
		st2.increase();
		st2.increase();
		st2.display();
		//static members can also be accessed without any object
		staticDemo.setStaticVar(50); //call static method without using any object
		System.out.println("Static variable without object:" + staticDemo.staticVar);
		
	}

}
