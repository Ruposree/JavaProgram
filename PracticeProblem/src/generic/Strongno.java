package generic;

public class Strongno {
	
	public static void fact(int rem) {
		int fact=1;
		for(int i=1;i<=rem;i++) {
			fact=fact*i;
			
		}
		System.out.println(fact);
	}
	
	public static int strongNo(int num) {
		int rem=0;
		while(num!=0) {
			rem=num%10;
			num=num/10;
			
		}
		return rem;
	}

	public static void main(String[] args) {
		strongNo(145);
	}
	



}
