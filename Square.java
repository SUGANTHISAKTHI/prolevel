package guvi;
import java.util.Scanner;
public class Square {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	int i,j;
	int n=2;
	int x,y;
	int e=0,f=0,g=0,h=0;
	int[] a=new int[n];
	int[] b=new int[n];
	int[] c=new int[n];
	int[] d=new int[n];
	for(i=0;i<n;i++){
		a[i]=s.nextInt();
		e=e+a[i];
	}
	for(i=0;i<n;i++){
		b[i]=s.nextInt();
		f=f+b[i];
	}
	for(i=0;i<n;i++){
		c[i]=s.nextInt();
		g=g+c[i];
	}
	for(i=0;i<n;i++){
		d[i]=s.nextInt();
		h=h+d[i];
	}
	x=e-g;
	y=f-h;
	if(x==y){
		System.out.println("Square");
	}else{
		System.out.println("not square");
	}
	
	
	
	}

}
