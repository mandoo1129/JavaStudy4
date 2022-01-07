package com.iu.s9.himart;

public class Client {
	int money;
	int point;
	
	public void buy(Product p) {
		this.money = this.money-p.price;
		this.point = this.point + p.point;
		System.out.println("최종금액 : "+this.money);
		System.out.println("최종 포인트 : "+this.point);
	}


}