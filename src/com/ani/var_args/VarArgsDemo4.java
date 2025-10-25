package com.ani.var_args;

/*
 * var args can hold hetrogeneous types of data 
 */

class Hetro
{
	public void acceptHetoData(Object ...values)
	{
		for(Object value : values)
		{
			System.out.println(value);
		}
	}
}

public class VarArgsDemo4 {

	public static void main(String[] args) {
		Hetro h1 = new Hetro();
		h1.acceptHetoData(10, 12.76, 'A', new String("Ani"));

	}

}
