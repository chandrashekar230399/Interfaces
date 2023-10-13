package com.java.functional_interface;

import java.util.function.Function;

public class FunctionInterface1 {

	public static void main(String[] args) {
		Function<Integer, Integer> j = (t) -> t;
		{
			System.out.println(j.apply(10));
		}
	};

}
