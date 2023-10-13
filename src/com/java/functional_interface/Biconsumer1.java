package com.java.functional_interface;

import java.util.function.BiConsumer;

public class Biconsumer1 {

	public static void main(String[] args) {
		addTwo(1, 2, (x, y) -> System.out.println(x + y));         
        addTwo("Node", ".js", (x, y) -> System.out.println(x + y));

    }

    static <T> void addTwo(T a1, T a2, BiConsumer<T, T> c) {
        c.accept(a1, a2);

	}

}
