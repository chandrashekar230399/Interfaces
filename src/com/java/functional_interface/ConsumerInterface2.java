package com.java.functional_interface;

import java.util.function.Consumer;

public class ConsumerInterface2 {

	public static void main(String[] args) {
		Consumer<Double> d = (t)->{
			System.out.println("print:"+t);
		};
		 
		d.accept(30.6);


	}

}
