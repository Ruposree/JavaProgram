package practice02_array;

import java.util.Scanner;

public class DeleteanElement {
	static Scanner sc=new Scanner(System.in);
	public static int[] deleteAnElement(int[]arr) {
		System.out.println("Enter the index value");
		int index=sc.nextInt();
		System.out.println("Enter the element");
		int element=sc.nextInt();


		int arr1[]=new int[arr.length-1];
		for(int i=0;i<=arr1.length-1;i++) {
			if(i<index) {
				arr1[i]=arr[i];
			}
			else if(i>=index) {
				arr1[i]=arr[i+1];
			}

		}
		return arr1;



	}

	public static void main(String[] args) {
		int[] c=GenericArray.creatingAnArray();
		int[] i=GenericArray.initialsingAnArray(c);
		int []d=deleteAnElement(i);
		for(int p:d) {
			System.out.println(p);
		}
	}

}
