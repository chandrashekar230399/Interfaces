package com.java.functional_interface;



interface A {
	void display();

	// String toString();
}
//class B extends Object implements A{
//	public void display() {
//		System.out.println("hello how old are you?");
//	}
//}

public class Demo2 {

	public static void main(String[] args) {
//		A obj = new A() {
//			
//			public void display() {  //anannomyus inner class because no class name
//				System.out.println("hello how old are you?");
//				
//			}
//		};
//		obj.display();
		//this is lambda expression
		A obj = ()-> System.out.println("hello how old are you?");
		obj.display();
	}

}
