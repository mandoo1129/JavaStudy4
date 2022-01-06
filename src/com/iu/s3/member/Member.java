package com.iu.s3.member;

public class Member {
	
	private String name;
	private String email;
	private double muge;
	private double ki;
	private int age;
	
	public void setAge(int age) {
		this.age=20;
		if(age>0 && age<200) {
			this.age=age;
		}
	}
	
	public int getAge() {
		return this.age;
	}

//- 이름
//- 이메일주소
//- 몸무게
//- 키
//- 나이


}