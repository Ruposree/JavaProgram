package generic;

import java.util.Scanner;

public class Armstrongno {

	public static void main(String[] args) {
		
		int num;
		int temp;
		int sum;
		int i=1;
		int n=0;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		sum=0;
		i=num;
		
		while(num!=0) {
			n=num%10;
			num=num/10;
			sum=sum+(n*n*n);
			
		}
		if(sum==i) {
			System.out.println("it is an armstrong no");
		}
		else {
			System.out.println("it is not an armStrong no");
		}

	}

}
