package practice02;

import java.util.Scanner;

public class PerfectNo {
	
	static Scanner sc=new Scanner(System.in);
	
	public static void perfectNo() {
		System.out.println("Enter the num");
		int num=sc.nextInt();
		int rem=0;
	
		for(int i=1;i<=num;i++) {
			if(i<num && num%i==0) {
				rem=i+rem;
			}
			
		
		}
		if(num==rem) {
			
			System.out.println("it is a perfect no");
		}
		else {
			System.out.println(num+" = "+rem); 
			System.out.println("it is not a perfect no");
		}
		
	}

	public static void main(String[] args) {
		perfectNo();

	}

}
