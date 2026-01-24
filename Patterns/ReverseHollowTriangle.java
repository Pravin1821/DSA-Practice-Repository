import java.util.*;
public class ReverseHollowTriangle{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int row=1;row<=n;row++)
		{
			for(int space=1;space<=(row-1);space++)
				System.out.print(" ");
			for(int loop=1;loop<=n;loop++)
			{
				if(loop==row || loop==n || row==1)
					System.out.print("* ");
				else if(loop>row)
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
