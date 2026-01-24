import java.util.*;
public class DoubleHill{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int c=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
				System.out.print("  ");
			for(int k=1;k<=((2*n-1)+c);k++)
			{
				if(k<=(2*i-1) ||(k>=(2*n-1))){
					if(k%2!=0)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				else
					System.out.print("  ");
			}
			c+=2;
			System.out.println();
		}
	}
}