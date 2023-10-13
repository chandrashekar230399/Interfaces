package com.java.functional_interface;

import java.util.function.Function;

public class FunctionInterface {

	public static void main(String[] args) { 
		Function<String, Integer> si = (t) -> t.length();
		System.out.println(si.apply("chandu"));

		Function<Integer, String> ss = (t) -> {
			if (t % 2 == 0) {
				System.out.println("even");
				return "yah";
			} else {
				System.out.println("odd");
				return "noo";
			}

		};
		System.out.println(ss.apply(12));
		Function<String,Integer> s1 = (t)-> t.length();
		Function<Integer,Integer> s2 = (number)-> number*2;
		Integer integer = s1.andThen(s2).apply("chandu");
		System.out.println(integer);

	}

}
