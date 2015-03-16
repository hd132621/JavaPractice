package org.dimigo.basic;

public class PrimitiveDataType {

	public static void main(String[] args) {
		String name = "아이유";
		System.out.println("이름 : " +name);
		boolean trans = true;
		System.out.printf("성별 : ");
		if(trans)
			System.out.println("여자");
		int old = 23;
		System.out.printf("나이 : %d\n", old);
		double tall = 161.8;
		System.out.printf("키 : %.1fcm\n", tall);
		float weight = 44.3f;
		System.out.printf("몸무게 : %.1fkg\n", weight);
		char blood = 'A';
		System.out.println("혈액형 : "+blood);
	}

}
