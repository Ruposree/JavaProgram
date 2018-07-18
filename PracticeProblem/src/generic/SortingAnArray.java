package generic;

import java.util.Scanner;

public class SortingAnArray {


	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int arr[]=new int[sc.nextInt()];
		System.out.println("Enter the values");
		
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
			
		}
		for(int i:arr) {
			System.out.println(i);
		}
		int arr1[]=sortingAnArray(arr);
		for(int a:arr1) {
			System.out.println(a);
		}
		

	}

	public static int[] sortingAnArray(int [] arr) {

		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;

	}

}
