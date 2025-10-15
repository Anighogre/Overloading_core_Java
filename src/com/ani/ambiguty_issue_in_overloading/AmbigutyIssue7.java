package com.ani.ambiguty_issue_in_overloading;


class Test7
{
	public void accept(int d)
	{
		System.out.println("int");
	}
	
	public void accept(long s)
	{
		System.out.println("long");
	}
}

public class AmbigutyIssue7 {

	public static void main(String[] args) {
		Test7 t1 = new Test7();
		t1.accept(9);

	}

}

/*
 * Here int will be executed because int is the nearest typpe
 */
