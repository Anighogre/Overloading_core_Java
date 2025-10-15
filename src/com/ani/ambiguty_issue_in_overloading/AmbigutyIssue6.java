package com.ani.ambiguty_issue_in_overloading;

class Test6
{
	public void accept(byte d)
	{
		System.out.println("Short");
	}
	
	public void accept(short d)
	{
		System.out.println("byte");
	}
}
	
public class AmbigutyIssue6 {

	public static void main(String[] args) {
		Test6 t1 = new Test6();
//		t1.accept(9); // compilation error
		t1.accept((byte)9);
		t1.accept((short)9);

	}

}

/*
 * Here value 9 is of type int so, we can't assign to directly byte and short if we want explicit type
 * casting is required 
 */

