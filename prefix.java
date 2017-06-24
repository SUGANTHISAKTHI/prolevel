package Guvi;
import java.util.Scanner;
public class prefix {
	static String str3="";
	int i;
String prefix1(String str1,String str2){
	if(str1.length()==str2.length()){
	for(i=0;i<str1.length();i++){
		if(str1.charAt(i)==str2.charAt(i)){
			str3=str3+str1.charAt(i);}}}
	if(str1.length()>str2.length()){
		for(i=0;i<str1.length()-1;i++){
			if(str1.charAt(i)==str2.charAt(i)){
				str3=str3+str1.charAt(i);}}}
	if(str1.length()<str2.length()){
		for(i=0;i<str2.length()-1;i++){
			if(str1.charAt(i)==str2.charAt(i)){
				str3=str3+str1.charAt(i);}}}
	
	return str3;
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		String str2=s.nextLine();
		prefix p=new prefix();
		p.prefix1(str1, str2);
		System.out.println(str3);

	}

}
