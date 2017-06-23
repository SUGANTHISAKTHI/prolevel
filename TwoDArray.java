package guvi;
import java.util.Scanner;
public class TwoDArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=s.nextInt();
		int m=s.nextInt();
		int sum=0;
		int i,j,k;
		int[][] a=new int[n][m];
		for(i=0;i<n;i++){
			for(j=0;j<m;j++){
				a[i][j]=s.nextInt();
			}
		}
		for(i=0;i<n;i++){
			for(j=0;j<m;j++){
				System.out.print(" "+a[i][j]);			
				}
			System.out.print("\n");
		}
		sum=sum+a[0][0]+a[0][m-1]+a[n-1][0]+a[n-1][m-1];
		System.out.println(sum);

	}

}
