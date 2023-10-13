package com.java.functional_interface;
@FunctionalInterface
interface Hello {
	void add(int x, int y);
}

public class Demo3 {

	public static void main(String[] args) {
		Hello hoo = ( x, y)-> {
			System.out.println(x+y);
			System.out.println(x*y);
		};
		hoo.add(5, 5);
	}
}
