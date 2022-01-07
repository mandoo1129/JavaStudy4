package com.iu.s5;

public class MyGodMain {

	public static void main(String[] args) {
		MyGod myGod = MyGod.makeGod();
		
		System.out.println(myGod);
		//SingleTon
		
		MyGod my2 = MyGod.makeGod();
		System.out.println(my2);
		System.out.println(MyGod.makeGod());
		System.out.println(MyGod.makeGod());
		System.out.println(MyGod.makeGod());
		System.out.println(MyGod.makeGod());
		System.out.println(MyGod.makeGod());
	}

}