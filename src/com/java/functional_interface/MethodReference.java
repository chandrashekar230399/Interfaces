package com.java.functional_interface;
interface StaticRefernce{
	void refernce();
}
public class MethodReference {

	public static void saySomething(){
		System.out.println("i'm a java devloper");
	}
	public static void main(String[] args) {
		                 //classname::methodname
		StaticRefernce s = MethodReference::saySomething;
		s.refernce();
	}

}
