package guvi;
import java.util.Scanner;
public class prosum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int n1=n;
		int n2=n1;
		int max=0,i;
		int sum1=0,sum2 ;
		int r;
		String str1=String.valueOf(n);
		char ch2=str1.charAt(0);
		int min=Character.getNumericValue(ch2);
		int len=str1.length();
		for(i=0;i<len;i++){
			char ch1=str1.charAt(i);
			if(max<Character.getNumericValue(ch1)){
				max=Character.getNumericValue(ch1);
			}
			if(min>Character.getNumericValue(ch1)){
				min=Character.getNumericValue(ch1);
			}
		}
		//System.out.println(n1+"  "+n2);
		System.out.println(max+" "+min);
		int k;
		while(n1!=0){
			r=n1%10;
			sum1=sum1+max*r;
			n1=n1/10;
		}//System.out.println(sum1);
		while(sum1>=10){
			sum2=0;
			while(sum1!=0){
				r=sum1%10;
				sum2=sum2+r;
              sum1=sum1/10;
			}
			sum1=sum2;
		}int sum3=1;
		System.out.println(sum1);
		while(n2!=0){
			r=n2%10;
			k=min*r;
			sum3=sum3+sum3*k;
			n2=n2/10;
		}
		while(sum3>=10){
			sum2=0;
			while(sum3!=0){
				r=sum3%10;
				sum2=sum2+r;
				sum3=sum3/10;
			}sum3=sum2;
		}
		System.out.println(sum3);
	int result=0;
	if(sum1>sum3){
		result=sum3;
	}
	if(sum1<sum3){
		result=sum1;
	}
System.out.println(result);
int mainresult=result*result;
System.out.println(mainresult);
}
}
