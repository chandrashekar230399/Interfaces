package com.java.functional_interface;

import java.util.function.Consumer;

public class ConsumerInterface {
	

	public static void main(String[] args) {
		Consumer<Integer> ci = (t)->{
			System.out.println("Print:"+t);
		};
		 
		ci.accept(55);

	}

}
