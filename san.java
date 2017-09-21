package karthi;
import java.util.*;
public class san {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String str2="";
		int min=0;
		String str5="";
	for(int i=0;i<str.length();i++){
		str2="";
		char ch=str.charAt(i);
		str2=str2+ch;
		for(int j=i+1;j<str.length();j++){
			char ch1=str.charAt(j);
			str2=str2+ch1;
			if(ch==ch1){
				break;
			}
		}
		int length=str2.length();
		StringBuffer str3=new StringBuffer(str2);
		str3.reverse();
		String str4=str3.toString();
		if(str2.equals(str4)){
			if(length>min){
				min=length;
				System.out.println(str4);;
				str5=str2;
			}
		}
	}
System.out.println(str5);;

	}

}
