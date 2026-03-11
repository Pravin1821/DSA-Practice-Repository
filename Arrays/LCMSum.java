import java.util.*;
public class LCMSum{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		System.out.print(LCM(n));
	}
	public static long LCM(int n)
	{
		long sum = 0;
		for(int i=1;i<=n;i++)
		{
			int gcd = gcd(i,n);
			sum+=(long)(i*n)/gcd;
		}
		return sum;
	}
	public static int gcd(int a,int b)
	{
		while(b!=0)
		{
			int temp = b;
			b=a%b;
			a=temp;
		}
		return a;
	}
}