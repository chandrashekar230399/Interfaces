package com.java.functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionInterface2 {

	public static void main(String[] args) {
		 BiFunction<Integer, Integer, Integer> i = (x, y) -> x + y;
		 Integer result = i.apply(5, 7);
		 System.out.println(result);
		 
		 BiFunction<Integer, Integer, Double> i1 = (x, y) -> Math.pow(x,y);
		 Double result1 = i1.apply(2, 4);
		 System.out.println(result1);
		 
		 BiFunction<Integer, Integer,List<Integer>> i2 = (x, y) -> Arrays.asList(x+y);
		 List<Integer> result2 = i2.apply(3,8);
		 System.out.println(result2);
		 
	}

}
