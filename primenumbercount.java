package hunter;
import java.util.*;
public class primenumbercount {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the three input ");
	int input1=s.nextInt();
	int input2=s.nextInt();
	int input3=s.nextInt();
	int count=0;
	int flag=0;
	for(int i=input2;i<input3;i++){
		flag=0;
		for(int j=2;j<i;j++){
			if(i%j==0){
				flag=1;
				break;
			}
		}
		if(flag==0){
			int number=i;
			int r=0;
			System.out.println("prime number"+i);
			while(number!=0){
				r=number%10;
				if(r==input1){
					count++;
				}
				number=number/10;
			}
		}
	}
	System.out.println(count);

	}

}
