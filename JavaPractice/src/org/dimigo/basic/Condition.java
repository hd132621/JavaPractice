package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		System.out.println("<<고속도로 통행료 계산>>");
		int distance = 10;
		String car = "고속버스";
		int money;
		switch(car){
		case "고속버스":
			 money=550+(distance/10)*300;
			 break;
		case "경차":
			money = (distance/10)*300;
			break;
			default:
				money = 300+(distance/10)*300;
				break;
		}
		System.out.println("거리 : " + distance);
		System.out.println("차종 : " + car);
		System.out.println("통행료 : "+ money);
	}

}
