package generic;

import java.util.Scanner;

public class Strong {

	public static void main(String[] args) {
		
		int fact,rem;
		int sum=0;
		int save_num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no: ");
		int num=sc.nextInt();
		save_num=num;
		
		
		while(num!=0) {
			
			fact=1;
			rem=num%10;
			int div=num/10;
			num=div;
			
			for(int i=1;i<=rem;i++) {
				fact=fact*i;
			}
			sum=sum+fact;
		}
		
		if(sum==save_num) {
			System.out.println(save_num+" is a strong no");
		}
		else
		{
			System.out.println(save_num+": is not a strong no");
		}

	}

}
