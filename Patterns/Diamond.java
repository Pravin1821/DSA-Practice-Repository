import java.util.*;
public class Main{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt(),space=0,star=-1;
		for(int i=1;i<=(2*n-1);i++)
		{
			if(i<=n)
			{
				space=(n-i);
				star+=2;
			}
			else
			{
				star-=2;
				space++;
		    }
			for(int j=1;j<=space;j++)
				System.out.print("  ");
			for(int k=0;k<star;k++)
				System.out.print("* ");
			System.out.println();
		}
	}
}