import java.util.*;
public class Min{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
		int min=Integer.MAX_VALUE, sec=Integer.MAX_VALUE;
		for(int i=0;i<n;i++)
		{
			if(a[i]<min)
				min=a[i];
			if((a[i]>min)&&(a[i]<sec))
				sec=a[i];
		}
		System.out.print(min+" "+sec);
	}
}