package Combine;



public class FactorialusingRecursion {
	
	public static int recursion(int n) {
		
	 if(n==0||n==1)
		 return 1;
	 else 
		 return n*recursion(n-1);
	 
 }
	
	public static void main(String[] args) {
		
		System.out.println(recursion(6));

	}

}
