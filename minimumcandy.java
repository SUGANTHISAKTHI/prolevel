package PRO;
import java.util.*;
public class minimumcandy {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter the number of child");
int size=s.nextInt();
System.out.println("Enter the rating value");
int[] array=new int[size];
for(int i=0;i<size;i++){
	array[i]=s.nextInt();
}
int candy=0;
int count=0;
for(int i=1;i<size;i++){
	count=0;
	if(array[i]>0&&array[i]>array[i-1]){
		count=count+1;
		candy=candy+count;
	}
}if(candy!=0){
System.out.println("The minimum candy is"+candy);
}
else{
	System.out.println("There is no candy");
}

	}

}
