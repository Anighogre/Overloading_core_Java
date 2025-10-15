package com.ani.autoboxing;

public class Autoboxing2 
{
	public static void main(String[] args) 
	{
		byte b = 12;
		Byte b1 = Byte.valueOf(b);
		System.out.println(b1);
		
		short s = 122;
		Short s1 = Short.valueOf(s);
		System.out.println(s1);
		
		int i = 98371;
		Integer i1 = Integer.valueOf(i);
		System.out.println(i1);
		
		long l = 94819084124L;
		Long l1 = Long.valueOf(l);
		System.out.println(l1);
		
		float f = 121.1F;
		Float f1 = Float.valueOf(f);
		System.out.println(f1);
		
		double d = 221.2D;
		Double d1 = Double.valueOf(d);
		System.out.println(d1);
		
		char c = 'A';
		Character c1 = Character.valueOf(c);
		System.out.println(c1);
		
		boolean bool = true;
		Boolean bool1 = Boolean.valueOf(bool);
		System.out.println(bool1);
		
		
	}

}
