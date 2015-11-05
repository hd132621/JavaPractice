/**
 * 
 */
package org.dimigo.thread;

/**
 * <pre>
 * org.dimigo.thread
 * 		|_ Race
 *  
 * 1. 개요 :
 * 2. 작성일 : 2015. 11. 5.
 * </pre>
 *
 * @author ijaehyeog
 * @version 1.0.0
 * 
 */
public class Race {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		System.out.println("main thread start");
		
		Runner t1 = new Runner("정성민");
		Runner t2 = new Runner("정성운");
		
		
		t1.start();
		t2.start();
		
		
		System.out.println("main thread end");
	}

}
