package com.java.functional_interface;

import java.util.function.Predicate;

public class PredicateInterface {

	public static void main(String[] args) {
		Predicate<String> ss = (s) -> true;
		{
			boolean b = ss.test("chandu");
			System.out.println(b);
		}

	}

}
