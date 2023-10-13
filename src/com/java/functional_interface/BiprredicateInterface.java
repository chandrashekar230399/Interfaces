package com.java.functional_interface;

import java.util.function.BiPredicate;

public class BiprredicateInterface {

	public static void main(String[] args) {
		BiPredicate<String, String> pre = (s1, s2) -> (s1.equals(s2));{
			System.out.println(pre.test("chandu","chandu"));
			System.out.println(pre.test("ch srinu","CH srinu"));
			
		}
		

	}

}
