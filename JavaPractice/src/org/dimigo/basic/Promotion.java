package org.dimigo.basic;

public class Promotion {

	public static void main(String[] args) {
		System.out.println("<<디미베네 연간 인건비>>");
		int  emp, store;
		long sal = 1700000L;
		System.out.println("월 평균 급여 : " + String.format("%,d", sal) +"원");
		emp = 3;
		System.out.println("점포내 직원 수 : "+ emp + "명");
		store = 1500;
		System.out.println("점포 수 : " + String.format("%,d", store) +"개\n");
		System.out.println("연간 인건비 :"+ String.format("%, d", sal*emp*store*12) + "원");
	}

}
