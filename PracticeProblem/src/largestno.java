import java.util.Scanner;

public class largestno {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {

		System.out.print("Enter number of elements in the array:");
		//to set the size
		int arr[] = new int[sc.nextInt()];
		//to set the elements
		System.out.println("Enter the element");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		
		int max=arr[0];
		for(int i=0;i<=arr.length-1;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
			
		}
		System.out.println(max);
	}

}
