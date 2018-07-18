package practice02;

import java.util.Scanner;

public class ArmstrongNo {
	static Scanner sc=new Scanner(System.in);
	
	public static void armstrong() {
		int div=0;
		int rem=0;
		System.out.println("enter the no");
		int num=sc.nextInt();
		int n=num;
		int count=0;
		while(n!=0) {
			div=n/10;
			count++;
			n=div;
		}
		
		n=num;
		int sum=0;
		while(n!=0) {
			rem=n%10;
			int r=rem;
			for(int i=1;i<count;i++) {
				r=rem*r;
			}
			sum=sum+r;
			div=n/10;
			n=div;
		}
		if(num==sum)
			System.out.println("armstrong no");
		else
			System.out.println("not an armstrong no");
	}

	public static void main(String[] args) {
		
		armstrong();
	}

}
