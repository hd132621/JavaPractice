package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		System.out.println("<<도형 넓이 비교>>");
		int a = 9, b= 10;
		double h = 5.8;
		double h1 = 5.4;
		double square1 = (a+b)*h/2;
		double square2 = a*h1;
		System.out.println("사다리꼴 넓이 : "+ square1);
		System.out.println("평행사변형 넓이 : "+ square2);
		System.out.println("");
		if(square1 > square2){
		System.out.println("사다리꼴이 평행사변형 보다 "+(square1-square2)+" 더 큽니다.");
		}
		else if(square1 < square2){
			System.out.println("사디리꼴이 평행사변형 보다 "+(square2-square1)+" 더 작습니다.");
			}
		else {
			System.out.println("사다리꼴과 평행사변형의 넓이는 같습니다.");
		}
	}

}
