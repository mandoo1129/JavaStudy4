package com.iu.s6.student;

public abstract class StudentDTO {
	
	String name;
	int num;
	int kor;
	int eng;
	int math;
	int total;

	public abstract int setTotal();

}