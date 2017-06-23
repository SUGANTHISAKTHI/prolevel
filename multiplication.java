package Guvi;
import java.util.Scanner;
public class multiplication {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0,r,m;
		sum=sum+n;
		while(n!=0){
			r=n%10;
			sum=sum*r;
			n=n/10;
		}
		System.out.println(sum);
		

	}

}
