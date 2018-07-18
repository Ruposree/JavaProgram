import java.util.Scanner;

public class Demo1 {
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("enter the sie of an array");
		int[] arr=new int[sc.nextInt()];
		arr=test1(arr);
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
		

	}
	
	public static int[] test1(int[] arr) {
		System.out.println("enter the elements");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
			
		}
		return arr;
		
		
	}

}
