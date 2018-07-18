package practice02_array;
import java.util.Scanner;

public class GenericArray {
	
	static Scanner sc=new Scanner(System.in);
	
	public static int[] creatingAnArray() {
		System.out.println("Enter the size of an array");
		int []arr=new int[sc.nextInt()];
		return arr;
	}
	
	public static int[] initialsingAnArray(int arr[]) {
		System.out.println("Enter the elements you want to add");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {
		int c[]=creatingAnArray();
		initialsingAnArray(c);

	}

}
