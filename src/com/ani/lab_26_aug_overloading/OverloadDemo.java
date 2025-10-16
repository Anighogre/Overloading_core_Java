package com.ani.lab_26_aug_overloading;

public class OverloadDemo 
{
	public static void main(String[] args) 
	{
		DataTypePrinter d1 = new DataTypePrinter();
		d1.printData((byte)127);
		d1.printData((short)32767);
		d1.printData(2147483647);
		d1.printData(9223372036854775807L);
		d1.printData(44.5F);
		d1.printData(74.65);
		d1.printData('A');
		d1.printData(false);
		d1.printData("Ani");
	}

}
