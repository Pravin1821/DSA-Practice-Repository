import java.util.*;
public class Trianglenum{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(n-i);j++)
				System.out.print("  ");
			int val=i;
			for(int s=1;s<=(2*i-1);s++)
			{
				if(s==1 || s==(2*i-1))
					System.out.print(i+" ");
				else
				{
					if(s<=i)
						System.out.print(--val+" ");
					else
						System.out.print(++val+" ");
				}
			}
			System.out.println();
		}
	}
}
				