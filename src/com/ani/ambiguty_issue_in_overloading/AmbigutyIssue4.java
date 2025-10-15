package com.ani.ambiguty_issue_in_overloading;

class Test4
{
	public void accept(short ...d)
	{
		System.out.println("Short");
	}
	
	public void accept(byte ...d)
	{
		System.out.println("byte");
	}
}
public class AmbigutyIssue4 {

	public static void main(String[] args) {
		Test4 t1 = new Test4();
		t1.accept();

	}

}
/*
 *Here byte will be executed because byte is a more specific type  
*/