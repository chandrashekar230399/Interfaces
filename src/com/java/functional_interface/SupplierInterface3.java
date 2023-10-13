package com.java.functional_interface;

import java.util.function.Supplier;

public class SupplierInterface3 {

	public static void main(String[] args) {
		Supplier<Boolean> ii = ()->(true);{
			
			System.out.println(ii.get());
		}
		
	}

}
