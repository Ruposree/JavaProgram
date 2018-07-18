package practice;

import java.util.Scanner;

public class Fiboseries {

	public static void fiboSeries(int n) {
		int fn=0;
		int sn=1;
		int next=0;
		System.out.print(fn+" "+sn);
		for(int i=0;i<=n;i++) {
			System.out.print(" "+(next=fn+sn));

			fn=sn;
			sn=next;

		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		fiboSeries(sc.nextInt());

		sc.close();
	}

}
