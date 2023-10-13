package com.java.functional_interface;

import java.util.function.Supplier;

public class SupplierInterface1 {

	public static void main(String[] args) {
		Supplier<Integer> i = () -> (100);
		{

			System.out.println(i.get());
		}

	}

}
