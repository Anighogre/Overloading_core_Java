package com.ani.ambiguty_issue_in_overloading;

class Test1{
	public void accept(int d)
	{
		System.out.println("int");
	}
	
	public void accept(char d)
	{
		System.out.println("char");
	}
}

public class AmbigutyIssue1
{
	public static void main(String[] args) 
	{
		Test1 t1 = new Test1();
		t1.accept(6);
	}

}

/*
 * Here 6 is int type so int will be executed
 */
