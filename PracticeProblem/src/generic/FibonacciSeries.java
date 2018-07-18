/*
 * 0 1 1 2 3 5 8 13
 * 
 */
package generic;

public class FibonacciSeries {

	public static void fiboSeries(int num){
		int firstno=0;
		int secondno=1;
		int next=0;

		System.out.print(firstno+" "+secondno);
		for(int i=2;i<=num;i++) 
		{

			next=firstno+secondno;
			System.out.print(" "+next);
			firstno=secondno;
			secondno=next;

		}
	}

	public static void main(String[] args) {

		fiboSeries(10);






	}

}
