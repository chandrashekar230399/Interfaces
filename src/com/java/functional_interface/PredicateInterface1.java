package com.java.functional_interface;

import java.util.function.Predicate;

public class PredicateInterface1 {

	public static void main(String[] args) {
		 Predicate<Integer> p =(t)->true; {
			 boolean b =p.test(10);
				System.out.println(b);
		};
		

	}

	

}
