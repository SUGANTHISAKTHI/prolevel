package Guvi;
import java.util.Scanner;
public class subarray1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=s.nextInt();
		int ar=0,br=0;
		int[] a=new int[n];
		int[] b=new int[n];
		int i,j;
		int sum1=0,sum2=0;
		for(i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		int m=n/2;
		if(n%2==0){
			for(i=0;i<m;i++){
				b[i]=a[i];
			}
		for(i=0;i<m;i++){
			sum1=sum1+b[i];
			System.out.println(b[i]);
		}
		for(i=m;i<n;i++){
			sum2=sum2+a[i];
			System.out.println(a[i]);
		}
		ar=sum1/m;
		br=sum2/(n-m);
		//System.out.println(sum1);
		//System.out.println(sum2);
		//System.out.println(m);
		//System.out.println(n-m);
		//System.out.println(br);
		//System.out.println(ar);
		
		}
		if(n%2==1){
			for(i=0;i<m+1;i++){
				b[i]=a[i];
			}
		for(i=0;i<m+1;i++){
			sum1=sum1+b[i];
			System.out.println("m value is"+b[i]);
		}
		for(i=m+1;i<n;i++){
			sum2=sum2+a[i];
			System.out.println(a[i]);
		}
		ar=sum1/(m+1);
		br=sum2/(n-(m+1));
		//System.out.println(m+1);
		//System.out.println(n-(m+1));
		}
	if(ar==br){
			System.out.println("It is possible");
		}else{
			System.out.println("Not possible");
	}
	}

}
