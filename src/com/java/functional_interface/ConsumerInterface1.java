package com.java.functional_interface;

import java.util.function.Consumer;

public class ConsumerInterface1 {

	public static void main(String[] args) {
		Consumer<String> s = (t)->{
			System.out.println("print:"+t);
		};
		 
		s.accept("chandu");

	}

}
