import java.util.*;
public class SevenSeg{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		boolean k=false,p=false;
		if(n==2 || n==3 || n==5 || n==7 || n==8 || n==9 || n==6)
			System.out.print(" - ");
		System.out.println();
		if(n==1 || n==4 || n==5 || n==6 || n==8 || n==9)
		{
			k=true;
			System.out.print("|");
		}
		if((k)&&(n==2 || n==3 || n==4 || n==7 || n==8 || n==9))
		{
			k=false;
			System.out.print(" |");
		}
		else
			System.out.print("  |");
		System.out.println();
		if(n==2 || n==3 || n==4 || n==5 || n==6 || n==8 || n==9)
			System.out.print(" - ");
		System.out.println();
		if(n==1 || n==2 || n==6 || n==8)
		{
			p=true;
			System.out.print("|");
		}
		if((p)&&(n==3 || n==4 || n==5 || n==6 || n==7 || n==8 || n==9))
		{
			System.out.print(" |");
			p=false;
		}
		else
			System.out.print("  |");
		System.out.println();
		if(n==2 || n==3 || n==5 || n==6 || n==8)
			System.out.print(" - ");
	}
}