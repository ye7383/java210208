package com.base;

public class Helloworld {
	int age = 20; //전역변수
	public static void main(String[] args) {
		Helloworld hw = new Helloworld();
		hw.age = 28;
		System.out.println("당신의 나이는"+hw.age+" 입니다.");
		System.out.println("2차 수정한 부분입니다.");

	}

}
