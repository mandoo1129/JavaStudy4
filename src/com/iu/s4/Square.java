package com.iu.s4;

public class Square {
	
	public static final int SERO=1;
	final int GARO_SIZE;
	
	public Square (){
		this.GARO_SIZE=5;
	}
	
	static {
		//Square.SERO=3;
	}
	
	public static void info() {
		System.out.println("Class Method");
		//System.out.println(this.garo);
		System.out.println(Square.sero);
		//this.info2();
	}
	
	public void info2() {
		final int NUM=1;
		//NUM=2;
		System.out.println("Instance Method");
		
		System.out.println(Square.sero);
		Square.info();
	}

}