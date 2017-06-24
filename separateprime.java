package Guvi;
public class separateprime {
public static void main(String[] args) {
		int i,j=0,n,k,sum,r;
		int[] a=new int[25];
		int[] b=new int[25];
		for(n=2;n<100;n++){
			k=0;
		for(i=2;i<=n;i++){
if(n%i==0){
	k++;
}}
		if(k==1){
			a[j]=n;
			j++;
		}
}
		for(i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		j=0;
		for(i=0;i<a.length;i++){
			sum=0;
			while(a[i]!=0){
				r=a[i]%10;
				sum=sum+r;
				a[i]=a[i]/10;
			}
			b[j]=sum;
			j++;
		}
		for(i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
		System.out.println("The repeated elment is ");
		for(i=0;i<b.length;i++){
			for(j=0;j<b.length;j++){
			if(b[i]==b[j]){
				System.out.println(b[i]);
			}
		}
		}
}
}
