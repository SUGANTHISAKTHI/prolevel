package Guvi;
import java.util.Arrays;
import java.util.Scanner;
public class TwoDArraySorting {


	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=s.nextInt();
		int m=s.nextInt();
		int temp=0;
		System.out.println("Enter the array number");
		int[][] a=new int[n][m];
		int i,j,k,l;
		for(i=0;i<n;i++){
			for(j=0;j<m;j++){
				a[i][j]=s.nextInt();
			}
		}
		for(i=0;i<n;i++){
			for(j=0;j<m;j++){
				for(k=1;k<m;k++){
				if(a[i][j]>a[i][k]){
					//System.out.println(a[i][j]);
					//System.out.println(a[i][j+1]);
					temp=a[i][j];
					a[i][j]=a[i][k+1];
					a[i][k+1]=temp;
				}//System.out.println(a[i][j]+""+a[i][j+1]);
				}
			}
		}
		for(i=0;i<n;i++){
			for(j=0;j<m;j++){
				System.out.print(a[i][j]);
			}
			System.out.print("\n");
		}

		for(j=0;j<m;j++){
				for(i=0;i<n;i++){
				for(k=i+1;k<n;k++){
				if(a[i][j]>a[k][j]){
							temp=a[i][j];
							a[i][j]=a[k][j];
							a[k][j]=temp;
						}
				
					}
				}
				
			}
		for(i=0;i<n;i++){
			for(j=0;j<m;j++){
				System.out.print(a[i][j]);
			}
			System.out.print("\n");
		}
	}

}
