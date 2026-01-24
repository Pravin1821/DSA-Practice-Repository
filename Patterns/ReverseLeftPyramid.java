import java.util.*;
public class ReverseLeftPyramid{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int row=1;row<=n;row++)
		{
			for(int space=1;space<=(row-1);space++)
				System.out.print("  ");
			for(int star=1;star<=((n-row)+1);star++)
				System.out.print("* ");
			System.out.println();
		}
	}
}