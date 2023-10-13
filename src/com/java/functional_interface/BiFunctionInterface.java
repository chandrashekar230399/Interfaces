package com.java.functional_interface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionInterface {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> Addition = (t, u) -> (t + u);
		BiFunction<Integer, Integer, Integer> subtraction = (t, u) -> (t - u);
		BiFunction<Integer, Integer, Integer> multiplication = (t, u) -> (t * u);
		BiFunction<Integer, Integer, Integer> division = (t, u) -> (t / u);

		Function<Integer, Integer> function = (number) -> (number * number);
		
		Integer ii = Addition.andThen(function).apply(3,3);
		System.out.println(ii);

		{
			System.out.println(Addition.apply(10, 20));
			System.out.println(subtraction.apply(1000, 200));
			System.out.println(multiplication.apply(30, 20));
			System.out.println(division.apply(100, 50));
		}
	}

}
