package ArrayDemo;

import java.util.Scanner;

public class Demo2 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter the size of aray");
		int arr[]=new int[sc.nextInt()];
		addElements(arr);
		for(int a:arr) {
			System.out.println(a);
		}

	}

	public static int[] addElements(int [] arr) {
		System.out.println("enter the element");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();

		}
		return arr;
	}

	/*public static int[] printArray(int[] arr) {
		for(int a[]:arr1) {
			return a;
			System.out.println(a);
		}
	 */


}


