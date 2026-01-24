import java.util.*;
public class Butterfly{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int k=0;
		for(int i=1;i<=(2*n-1);i++)
		{
			if(i<=n)
				k=i;
			else
				k--;
			for(int j=1;j<=(2*n-1);j++)
			{
				if(j<=k || j>=(2*n-k))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}