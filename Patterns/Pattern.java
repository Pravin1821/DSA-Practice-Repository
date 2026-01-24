import java.util.*;
public class Pattern{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		char a='A';
		for(int row=1;row<=n;row++)
		{
			for(int j=1;j<=row;j++)
				System.out.print(a+++" ");
			System.out.println();
		}
	}
}