package Guvi;
import java.util.Scanner;
public class Panagram {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=s.nextLine();
		int i,j,count=0;
		for(i=0;i<str.length();i++){
			if(((str.charAt(i)>='A')&&(str.charAt(i)<='Z'))||((str.charAt(i)>='a')&&(str.charAt(i)<='z'))){
		count++;
			}
			
			}
		if(count++==26){
			System.out.println("The string is panagram");
		}else{
			System.out.println("Not a panagram");
		}

}
}
