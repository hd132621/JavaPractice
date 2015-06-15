/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 		|_ PiggyBankTest
 *  
 * 1. 개요 :
 * 2. 작성일 : 2015. 6. 15.
 * </pre>
 *
 * @author ijaehyeog
 * @version 1.0.0
 * 
 */
public class PiggyBankTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FamilyMember [] member = {
			new FamilyMember("아빠"), new FamilyMember("엄마"), new FamilyMember("나"), new FamilyMember("남동생"),	
		};
		FamilyMember.printMemberCnt();
		System.out.println();
		PiggyBank.putMoney(member[0], 1000);
		PiggyBank.putMoney(member[1], 5000);
		PiggyBank.putMoney(member[2], 2000);
		PiggyBank.putMoney(member[3], 1000);
		System.out.println();
		PiggyBank.printBalance();
		
		
	}

}
