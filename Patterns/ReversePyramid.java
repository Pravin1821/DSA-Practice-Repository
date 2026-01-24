import java.util.*;
public class ReversePyramid{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int s=(2*n-1);
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<i;j++)
				System.out.print("  ");
			for(int k=1;k<=s;k++)
				System.out.print((k%2!=0)?"* ":"  ");
			System.out.println();
			s-=2;
		}
	}
}
					