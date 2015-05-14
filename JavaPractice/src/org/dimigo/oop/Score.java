/**
 * 
 */
package org.dimigo.oop;
import java.util.*;
/**
 * <pre>
 * org.dimigo.oop
 * 		|_ Score
 *  
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 14.
 * </pre>
 *
 * @author ijaehyeog
 * @version 1.0.0
 * 
 */
public class Score {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int kor, mat, eng, sum;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("국어 점수 입력 => ");
		kor = scanner.nextInt();
		System.out.print("수학 점수 입력 => ");
		mat = scanner.nextInt();
		System.out.print("영어 점수 입력 => ");
		eng = scanner.nextInt();
		scanner.close();
		System.out.println("");
		sum = kor + mat + eng;
		double avg = sum/3.0;
		StringBuilder sb = new StringBuilder();
		sb.append("<<점수 출력>>\n")
			.append("국어 점수 : ")
			.append(kor)
			.append("점\n")
			.append("수학 점수 : ")
			.append(mat)
			.append("점\n")
			.append("영어 점수 : ")
			.append(eng)
			.append("점\n")
			.append("총점 : ")
			.append(sum)
			.append("점\n")
			.append("평균 : ")
			.append(String.format("%.1f", avg))
			.append("점").toString();
		System.out.println(sb);
		
	}

}
