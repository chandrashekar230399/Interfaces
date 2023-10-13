  package com.java.functional_interface;

import java.util.function.BiConsumer;

public class Biconsumer {

	public static void main(String[] args) {

		BiConsumer<Integer, Integer> addTwo = (x, y) -> System.out.println(x + y);
		addTwo.accept(1, 2);

	}

}
