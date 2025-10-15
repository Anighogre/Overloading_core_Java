package com.ani.ambiguty_issue_in_overloading;

class Test2{
	public void accept(int ...d)
	{
		System.out.println("int");
	}
	
	public void accept(char ...d)
	{
		System.out.println("char");
	}
}

public class AmbigutyIssue2
{
	public static void main(String[] args) 
	{
		Test2 t1 = new Test2();
		t1.accept();
	}

}

/*
 * Here char will be executed because char will be more specific type
 */
