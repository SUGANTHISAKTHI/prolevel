package hunter;
import java.util.*;
public class NUMBER {
public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] array=new int[n];
		for(int i=0;i<n;i++){
			array[i]=s.nextInt();
		}
		int k=s.nextInt();
		int count=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if((array[i]-k==array[j])||(array[i]+k==array[j])){
					count++;
				}
			}
		}
		System.out.print(count);

	}

}
