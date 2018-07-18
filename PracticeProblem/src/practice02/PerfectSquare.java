package practice02;

import java.util.Scanner;

public class PerfectSquare {
	static Scanner sc=new Scanner(System.in);
	
	public static void prefectsquare() {
		
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int count=0;
		for(int i=1;i<=num;i++) {
			 
			
			if (i*i==num) {
				count++;
			}
			
		}
		if (count==1) {
			System.out.println("it is a Perfect Square");
		}
		else {
			System.out.println("it is not a perfect square");
		}
		
	}

	public static void main(String[] args) {
		
		prefectsquare();
	}

}
