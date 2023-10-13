package com.java.functional_interface;

@FunctionalInterface
interface Name {
	void StudentAge(int sno, String name,float age);
}

public class Demo4 {

	public static void main(String[] args) {
		Name n = (sno, name,age) -> {
			System.out.println("student details:");
			System.out.println("sno:"+sno);
			System.out.println("sname:"+name);
			System.out.println("sage:"+age);
		};
		n.StudentAge(23, "chandu", 25);
	}

}
