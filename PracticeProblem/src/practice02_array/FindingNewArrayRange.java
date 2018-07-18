package practice02_array;

import java.util.Scanner;

public class FindingNewArrayRange {

	static Scanner sc=new Scanner(System.in);
	
	public static int[] sortingArray(int arr[]) {
		
		for(int i=0;i<=arr.length-1;i++) {
	
			for(int j=i+1;j<=arr.length-1;j++) {
				int temp=0;
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		
		return arr;
	}
	
	
	public static int[] sortingInAscending(int arr[]) {
		int temp=0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		return arr;
	}
	
	
	
	public static int[] swap2num(int arr[], int element) {
		int temp=0;
		for(int i=0;i<=arr.length-1;i++) {
				if(arr[i]==element) {
					temp=arr[i];
					arr[i]=arr[arr.length-3];
					arr[arr.length-3]=temp;
				}
				
			
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] c=GenericArray.creatingAnArray();
		int [] i=GenericArray.initialsingAnArray(c);
		System.out.println("Enter the element you want to swap");
		int element=sc.nextInt();
		int arr1[]=swap2num(i, element);
		for(int a:arr1) {
			System.out.println(a);
		}
	}

}
