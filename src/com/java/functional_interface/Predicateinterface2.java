package com.java.functional_interface;

import java.util.function.Predicate;

public class Predicateinterface2 {

	public static void main(String[] args) {
		 Predicate<Float> p =(t)->true; {
			 boolean b =p.test(10f);
				System.out.println(b);
		};

	}

}
