/* 5!=5*4!
 * 4!=4*3!
 * num=num*(num-1)!
 */

package generic;

public class FactorialWithRecursion {

	public static int factorialWithRecursion(int num) {
		
		for(int i=1;i<=num;i++) {
			if(num==1||num==0) {
				return 1;
			}
			else {
				return num*factorialWithRecursion(num-1);
			}

		}
		return 0;
	}
	public static void main(String[] args) {

		System.out.println(factorialWithRecursion(10));
	}

}
