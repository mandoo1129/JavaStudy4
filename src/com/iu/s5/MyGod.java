package com.iu.s5;

public class MyGod myGod;

	private MyGod() {}
		
	public static MyGod myGod() {
		
		if(MyGod.myGod == null) {
			MyGod myGod = new MyGod();
		}
		
		return MyGod.myGod;
		
	}

}
