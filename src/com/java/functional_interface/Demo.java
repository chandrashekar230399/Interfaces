package com.java.functional_interface;
@FunctionalInterface
interface Chandu{
	
	public void run(); //abstract method
	//public	void show();
	
}
public class Demo implements Chandu{

	public static void main(String[] args) {
		Demo d = new Demo();
		d.run();
		//  d.show();
		
	}

	@Override
	public void run() {
		System.out.println("run method is called");
		
	}

	//@Override
//	public void show() {
//		System.out.println("show method is called");
//		
//	}

	

}
