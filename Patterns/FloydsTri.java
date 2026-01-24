import java.util.*;
public class FloydsTri{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int c=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(c+++" ");
			}
			System.out.println();
		}
	}
}
				