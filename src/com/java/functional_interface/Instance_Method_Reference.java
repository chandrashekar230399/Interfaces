package com.java.functional_interface;
interface Instance{
	void instanceDisplay();
}
public class Instance_Method_Reference {

	public void instanceFlow() {
		System.out.println("this is instanceRefernce");
	}
	public static void main(String[] args) {
		Instance_Method_Reference n = new Instance_Method_Reference();
		Instance s= n::instanceFlow;
		s.instanceDisplay();
		
		Instance s1= new Instance_Method_Reference()::instanceFlow;
		s1.instanceDisplay();

	}

}
