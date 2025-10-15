package com.ani.ambiguty_issue_in_overloading;

class Test3
{
	public void accept(short ...d)
	{
		System.out.println("short");
	}
	
	public void accept(char ...d)
	{
		System.out.println("Char");
	}
	
}
public class AmbigutyIssue3 
{
	public static void main(String[] args) 
	{
		Test t3 = new Test();
//		t3.accept();
	}

}

/*
 * Here we will get compilation error because there is no relation between char and short based on 
 * the specific type rule
 */