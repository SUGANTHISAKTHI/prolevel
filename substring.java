package guvi;
import java.util.Scanner;
public class substring {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String str1=s.nextLine();
		String str2=s.nextLine();
		int n=str1.length();
		int m=str2.length();
		int i,j,k=0;
		for(i=0;i<n-1;i++){
			for(j=0;j<m-1;j++){
				if((str1.charAt(i)==str2.charAt(j))&&(str1.charAt(i+1)==str2.charAt(j+1))){
			    k++;

					break;
			   
				}
			}
		}
		if(k>1){
			System.out.println("true");
		}
	}

}
