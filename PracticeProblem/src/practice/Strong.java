package practice;

import java.util.Scanner;

public class Strong {
	public static void strong(int num) {
		int num1=num;
		int rem=0;
		int div=0;

		int sum=0;
		while(num>0)
		{
			rem=num%10;
			div=num/10;
			num=div;
			int fact=1;
			for(int i=1;i<=rem;i++) {
				fact=fact*i;
			}

			sum=sum+fact;

		}

		if (num1==sum) {
			System.out.println("Yes it is a strong no");
		}
		else {
			System.out.println("it is not a strong no");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		strong(sc.nextInt());
		
		sc.close();
	}

}
