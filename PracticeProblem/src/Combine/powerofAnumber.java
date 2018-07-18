package Combine;

public class powerofAnumber {

	public static int power(int n,int p) {
		int j=n;
		for(int i=1;i<p;i++) {
		j=n*j;
		
		
		}
		
		return j ;
	}
	public static void main(String[] args) {
		
System.out.println(power(2,3));
	}

}
