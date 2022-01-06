package com.iu.s4;

public class Square {
	
	public static int sero;
	int garo;
	
	public static void info() {
		System.out.println("Class Method");
		System.out.println(Square.sero);
		this.info2();
		

	}
	public void info2() {
		System.out.println("Instance Method");
		System.out.println(this.garo);
		System.out.println(Square.sero);
		Square.info();
		
	}
}
