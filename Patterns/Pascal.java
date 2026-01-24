import java.util.*;
public class Pascal{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[][]=new int[n][n];
		for(int row=0;row<n;row++)
		{
			for(int space=0;space<((n-row)+1);space++)
				System.out.print(" ");
			for(int val=0;val<=row;val++)
			{
				if(val==0 || val==(n-1))
				{
					a[row][val]=1;
					System.out.print(a[row][val]+" ");
				}
				else
				{
					a[row][val]=a[row-1][val-1]+a[row-1][val];
					System.out.print(a[row][val]+" ");
				}
			}
			System.out.println();
		}
	}
}