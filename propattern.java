package guvi;
import java.util.Scanner;
public class propattern {

	public static void main(String[] args) {
		
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int n=s.nextInt();
int i,j,k;
for(i=0;i<1;i++){
	for(j=0;j<n;j++){
		System.out.print(" *");
	}
	System.out.print("\n");
}
for(i=1;i<n-1;i++){
	for(j=0;j<1;j++){
		System.out.print(" *");
	}
	for(k=1;k<n-1;k++){
		System.out.print("  ");
	}
		for(j=0;j<1;j++){
		System.out.print(" *");
	}
	System.out.print("\n");
	}
	for(i=0;i<1;i++){
	for(j=0;j<n;j++){
		System.out.print(" *");
	}
}
	
	}
}


