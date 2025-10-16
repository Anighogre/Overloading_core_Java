package com.ani.lab_26_aug_overloading;

class Check
{
	public void form (int n)
	{
		System.out.println("int="+n+" char="+(char)n);
	}
	
	public void form (char n)
	{
		System.out.println("int="+(int)n+" char="+n);
	}
}

public class CheckIntegerAndChar
{
	public static void main(String[] args) 
	{
		Check c1 = new Check();
		c1.form(66);
		System.out.println();
		c1.form('D');
	}

}
