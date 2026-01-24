import java.util.*;
public class ReverseRightPyramid{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int row=1;row<=n;row++)
		{
			for(int star=1;star<=((n-row)+1);star++)
				System.out.print("* ");
			System.out.println();
		}
	}
}