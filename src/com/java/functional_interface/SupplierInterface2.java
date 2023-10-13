package com.java.functional_interface;

import java.util.function.Supplier;

public class SupplierInterface2 {

	public static void main(String[] args) {
		Supplier<Long> ii = ()->(9876543210L);{
			
			System.out.println(ii.get());
		}
		

	}

}
