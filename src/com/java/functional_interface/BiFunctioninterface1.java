package com.java.functional_interface;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class BiFunctioninterface1 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();  
		 
		map.put(1, "Anil");  
		map.put(2, "Vijay");  
		map.put(3, "Jagan");  
		map.put(4, "Anil");  
		map.put(5, "Eshwar");  
		map.put(6, "Anil");  
		map.put(7, "Naveen");  
		BiFunction<Integer,String,String> bi = (i,s)->"[Key="+i+", "+s+"("+Collections.frequency(map.values(), s)+")]";  
		
		map.forEach((i,s)-> System.out.println(bi.apply(i,s)));  
	}
		
	}

	


