package com.ani.unboxing;

/*
 * 	It is a technique through we can convert the wrapper object into 
 * corresponding primary data type.
 */

public class AutoUnboxing1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// upto JDK 1.4 v
		Integer obj = 15;
		int x = obj.intValue();
		System.out.println(x);

		// JDK 1.5 onwards
		Integer i1 = 23;
		int y = i1;
		System.out.println(y);
	}

}
