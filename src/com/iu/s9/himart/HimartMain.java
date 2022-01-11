package com.iu.s9.himart;

import com.iu.s8.rpg.*;

public class HimartMain {

	public static void main(String[] args) {
		
		Magition magition;
		Magition magition2;
		
		com.iu.s9.himart.Magition magition3;
		
		//Tv , Computer, Phone 정보 입력
		
		Computer computer = new Computer();
		computer.company="Samsung";
		computer.brand="갤럭시북";
		computer.cpu="i7";
		computer.price=200;
		computer.point=2;
		
		Phone phone = new Phone();
		phone.company="Apple";
		phone.brand="iphone12";
		phone.pixel=100;
		phone.price=150;
		phone.point=5;
		
		Tv tv = new Tv();
		tv.company="LG";
		tv.brand="오브제";
		tv.size=100;
		tv.price=300;
		tv.point=10;
		
		Client iu = new Client();
		iu.money=1000;
		iu.point=0;
		iu.buy(computer);
		

	}

}