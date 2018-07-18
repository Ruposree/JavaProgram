package practice02;
import java.util.Scanner;

public class SeriesofPrimeno {

	static Scanner sc=new Scanner(System.in);
	public static void primeno() {
		System.out.println("Enter the lower limit from where you want");
		int ll=sc.nextInt();
		System.out.println("Enter the upper limit till where you want");
		int ul=sc.nextInt();
		
		for(int i=ll;i<=ul;i++) {
			int count=0;
			for(int j=1;j<=100;j++) {

				if(i%j==0) {
					count++;
				}
			}

			if (count==2) {
				System.out.println(i);
			}
		}

	}

	public static void main(String[] args) {

		primeno();
	}
}
