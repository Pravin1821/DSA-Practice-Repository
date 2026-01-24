import java.util.*;
public class HollowTriangle{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int row=1;row<=n;row++)
		{
			for(int space=1;space<=(n-row);space++)
				System.out.print(" ");
			for(int loop=1;loop<=row;loop++)
			{
				if(loop==1 || loop==row || row==n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
