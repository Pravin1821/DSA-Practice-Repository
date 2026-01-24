import java.util.*;
public class HollowDiamond{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int spaceC=n, starC=-1;
		for(int i=1;i<=(2*n-1);i++)
		{
			if(i<=n)
			{
				spaceC=n-i;
				starC+=2;
			}
			else
			{
				spaceC++;
				starC-=2;
			}
			for(int j=1;j<=spaceC;j++)
				System.out.print("  ");
			for(int k=1;k<=starC;k++)
			{
				if(k==1 || k==starC)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}