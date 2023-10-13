package com.java.functional_interface;

import java.util.function.Predicate;

public class PredicateInterface3 {

	public static void main(String[] args) {
		 Predicate<Boolean> p =(t)->false; {
			 boolean b =p.test(false);
				System.out.println(b);
		};

	}

}
