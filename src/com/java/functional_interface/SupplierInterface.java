package com.java.functional_interface;

import java.util.function.Supplier;

public class SupplierInterface {

	public static void main(String[] args) {
		Supplier<String> ii = () -> ("chandu");
		{
			
			System.out.println(ii.get());
		}

	}

}
