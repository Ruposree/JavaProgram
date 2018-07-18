package pattern;

public class Demo1 {

	public static void main(String[] args) {
		/*int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1 && i<n) {
					System.out.println("*");
				}
				else if(i==n && j>=1){
					System.out.print("*");
				}
				
			}
			
		}*/
		
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1||i==n) {
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
