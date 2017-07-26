package PRO;
import java.util.*;
public class TwoString {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String string1=s.next();
	String string2=s.next();
	String string3=" ";
	int i,j;
	int cost=0;
	do{
	
		for(i=0;i<string1.length();i++){
			char char1=string1.charAt(i);
			char char2=string2.charAt(i);
			if(char1!=char2){
				cost=cost+3;
				string3=string3+char2;
				cost=cost+4;
				
			}else if(char1==char2){
			string3=string3+char1;
			}
		}
		string1="";
		string1=string3;
	System.out.println(string1+" "+cost);

	}while(string1.equals(string2));
}
}
