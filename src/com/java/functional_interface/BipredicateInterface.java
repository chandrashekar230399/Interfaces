package com.java.functional_interface;

import java.util.function.BiPredicate;

public class BipredicateInterface {

	public static void main(String[] args) {
		BiPredicate<String, Integer> filter = (x, y) -> {
            return x.length() == y;
        };

        boolean result = filter.test("java", 6);
        System.out.println(result);  

        boolean result2 = filter.test("javaScript", 10);
        System.out.println(result2); 

	}

}
