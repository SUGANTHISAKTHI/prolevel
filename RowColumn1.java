package guvi;
import java.util.Scanner;
public class RowColumn1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size n amd m");
		int n=s.nextInt();
		int m=s.nextInt();
		int[][] a=new int[n][m];
		int[][] b=new int[n][m];
		int i,j,k;
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
		}int p;
		for(i=0;i<m;i++){
			for(p=0;p<n;p++){
		      if(a[p][i]==0){
		    	  for(k=0;k<n;k++){
		    		  b[k][i]=0;
		    	  }
		      }
		      if(a[p][i]!=0){
		    	  b[p][i]=a[p][i];
		      }
			}
		}
	for(i=0;i<n;i++){
			for(j=0;j<m;j++){
				if(a[i][j]==0){
				for(k=0;k<m;k++){
					b[i][k]=0;
					}
				}
				if(a[i][j]!=0){
					b[i][j]=b[i][j];
				}
			
				}
	}
		for(i=0;i<n;i++){
			for(j=0;j<m;j++){
				System.out.print(" "+b[i][j]);
			}
			System.out.print("\n");
		}
		
		
	}

}
