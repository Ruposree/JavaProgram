package practice02;

import java.util.Scanner;

public class PrimeNo {
	static Scanner sc=new Scanner(System.in);
	public static void primeno() {
	System.out.println("Enter the number");
	int num=sc.nextInt();
	int count=0;
	for(int i=1;i<=100;i++) {
		if(num%i==0) {
			count++;
		}
	}
	if (count==2) {
		System.out.println("Prime no");
	}
	else {
		System.out.println("not a prime no");
	}
	
	}

	public static void main(String[] args) {
		
		primeno();
	}

}
