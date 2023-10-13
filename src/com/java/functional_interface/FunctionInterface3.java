package com.java.functional_interface;


import java.util.function.Function;

public class FunctionInterface3 {

	public static void main(String[] args) {
		Function<Integer,String> f = (m)->Integer.toString(m*m);{
			System.out.println(f.apply(20));
		};
		

	}

	

}
