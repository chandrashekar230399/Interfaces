package com.java.functional_interface;
interface Constructor{
	void same();
}
public class Constructor_method_reference {

	public Constructor_method_reference() {
		super();
		System.out.println("constructor method is called");
	}

	public static void main(String[] args) {
		Constructor c =Constructor_method_reference::new;
		c.same(); 

	}

}
