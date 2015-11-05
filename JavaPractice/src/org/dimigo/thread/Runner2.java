/**
 * 
 */
package org.dimigo.thread;

/**
 * <pre>
 * org.dimigo.thread
 * 		|_ Runner
 *  
 * 1. 개요 :
 * 2. 작성일 : 2015. 11. 5.
 * </pre>
 *
 * @author ijaehyeog
 * @version 1.0.0
 * 
 */
public class Runner2 extends Thread implements Runnable {
		private String name;
		public Runner2(){
			
		}
		public Runner2(String name){
			this.name = name;
		}
		
		public void run(){
			for(int i = 0 ; i <=11; i++){
				if(i == 0){
					System.out.println(name + " 출발");
				}
				else{
					System.out.println(name + (100-10*(i-1)) + "미터");
				}
				

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(name + "골인");
		}
		
}
