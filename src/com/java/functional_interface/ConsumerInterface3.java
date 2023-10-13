package com.java.functional_interface;

import java.util.function.Consumer;

public class ConsumerInterface3 {

	public static void main(String[] args) {
		Consumer<Float> f = (t)->{
			System.out.println("print:"+t);
		};
		 
		f.accept(300f);


	}

}
