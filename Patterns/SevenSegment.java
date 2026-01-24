import java.util.*;
public class SevenSegment{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		String a[][]={
			{" _ ","| |"," ","| |"," _ "}, //0
			{" ","| "," ","| "," "}, //1
			{" _ ","  |"," _ ","| "," _ "}, //2
			{"_"," |","_"," |","_"}, //3
			{" ","| |"," _ ","  |"," "}, //4
			{" _ ","| "," _","  |"," _"}, //5
			{" _","| "," _","| |"," _"}, //6
			{" _","  |"," ","  |"," "}, //7
			{" _ ","| |"," _ ","| |"," _"}, //8
			{" _","| |"," _","  |"," "} //9
		};
		int n=scan.nextInt();
		while(n>0){
			int p=n%10;
			for(int i=0;i<5;i++)
			{
				System.out.println(a[p][i]);
			}
			n/=10;
		}
	}
}