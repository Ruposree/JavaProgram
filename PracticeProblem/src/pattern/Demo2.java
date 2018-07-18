package pattern;

public class Demo2 {

	public static void main(String[] args) {
		/*int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==n && i>=1)
					System.out.println("*");
				else if(i==n && j>=1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
		}*/
		
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1; j<=n;j++) {
				if(i==n||j==n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
