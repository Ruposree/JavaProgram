/*
 * fn=fn-1+fn-2;
 */
package generic;

public class FibonacciSeriesUsingRecursion {
	
	public static int fiboSeries(int num) {
		if(num==1||num==0) {
			return 1;
		}
		else
			
		return fiboSeries(num-1)+fiboSeries(num-2);
		
	}

	public static void main(String[] args) {
		
		System.out.print(fiboSeries(5));

	}

}
