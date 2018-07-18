/*371=(3^3+7^3+1^3)=371
 * 
 */
package practice;

public class Armstrongno {
	
	
	public static void armstrongNo(int num) {
		int rem=0;
		int div=0;
		int count=0;
		int power=0;
		
		
		while(num!=0) {
			rem=num%10;
			div=num/10;
			num=div;
			count++;
			
		}
		power=power+rem*count;
		System.out.println(power);
	}

	public static void main(String[] args) {
		armstrongNo(213);

	}

}
