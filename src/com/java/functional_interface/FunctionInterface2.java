package com.java.functional_interface;

import java.util.function.Function;

public class FunctionInterface2 {

	public static void main(String[] args) {
		Function<Integer, String> h = (i) -> ("returning String");
		{
			System.out.println(h.apply(10));
		}

	};
	

}
