package ArrayDemo;

import java.util.Scanner;

public class FindingLargestNo {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
	System.out.println("Enter the size of an array");
		int[] arr=new int[sc.nextInt()];

	}
	
	public static int[] addElements(int[] arr) {
		System.out.println("Enter the Elements");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		
		return arr;
	}
	
	public static void largestNo(int [] arr) {
		int max=arr[0];
		int temp;
		for(int i=1;i<=arr.length-1;i++) {
			if(max<arr[i]) {
				temp=max;
				max=arr[i];
				arr[i]=max;
			}
				
		}
		
		
	}

}
