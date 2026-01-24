import java.util.*;
public class SecMax{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		int max=Integer.MIN_VALUE, sec=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			if(a[i]>max)
			{
				sec=max;
				max=a[i];
			}
			else if(sec<max && a[i]>sec)
				sec=a[i];
		}
		System.out.print(max+" "+sec);
	}
}