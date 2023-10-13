package com.java.functional_interface;
interface Method{
	void reference();
	
}
public class Static_Method_Reference {
	
	public static void methodReference() {
		System.out.println("this is static reference");
	}

	public static void main(String[] args) {
		Method m = Static_Method_Reference::methodReference;
		m.reference();
	}

}
