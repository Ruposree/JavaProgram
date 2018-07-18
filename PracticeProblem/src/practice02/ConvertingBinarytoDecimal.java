package practice02;

import java.util.Scanner;

public class ConvertingBinarytoDecimal {
	static Scanner sc=new Scanner(System.in);
	
	public static void conversionDecimaltoBinary() {
		System.out.println("Enter the number");
		int num=sc.nextInt();
		//int binary[]=new int[1000];
		int rem=0;
		int div=0;
		while(num!=0) {
			//binary[rem]=num%2;
			rem=num%2;
			System.out.println(rem);
			div=num/2;
			num=div;
		}
		
		/*for(int j=binary[rem]-1;j>=0;j--) {
			 System.out.print(binary[j]);
		}*/
		
	}

	public static void main(String[] args) {
		conversionDecimaltoBinary();

	}

}
