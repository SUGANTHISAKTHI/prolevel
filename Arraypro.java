package PRO;
import java.util.*;
public class Arraypro {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Array size");
	int n=s.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++){
		a[i]=s.nextInt();
	}
	int temp=0;
	int counti=0;
	int countj=0;
	for(int i=0;i<n;i++){
		for(int j=i+1;j<n;j++){
			counti=0;
			countj=0;
			String str1=Integer.toBinaryString(a[i]);
			String str2=Integer.toBinaryString(a[j]);
			for(int str1i=0;str1i<str1.length();str1i++){
				char ch=str1.charAt(str1i);
				if(ch=='1'){
					counti++;
				}
			}
				for(int str2j=0;str2j<str2.length();str2j++){
					char ch1=str2.charAt(str2j);
					if(ch1=='1'){
						countj++;
					}
			}
				if(counti<countj){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}else  if(counti==countj){
					float a1=a[i];
					float b=a[j];
					if(a1<b){
						temp=a[i];
						a[i]=a[j];
						a[i]=temp;
					}
				}
			}
	}
	for(int i=0;i<n;i++){
		System.out.println(a[i]);
	}

}

}