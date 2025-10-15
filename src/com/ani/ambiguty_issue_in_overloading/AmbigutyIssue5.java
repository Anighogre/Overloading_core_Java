package com.ani.ambiguty_issue_in_overloading;

class Test5
{
	public void accept(double ...b)
	{
		System.out.println("doubel");
	}
	
	public void accept(long ...d)
	{
		System.out.println("long");
	}
}
public class AmbigutyIssue5 {

	public static void main(String[] args) {
		Test5 t1 = new Test5();
		t1.accept();

	}

}

/*
 * Here long will be executed because long is the most specific type
 */
