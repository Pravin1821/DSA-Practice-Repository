import java.util.*;
public class Main{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int[][] a=new int[n][2];
		for(int i=0;i<n;i++)
		{
			a[i][0]=scan.nextInt();
			a[i][1]=scan.nextInt();
		}
		Arrays.sort(a,(x,y)->Integer.compare(x[1],y[1]));
		int c=0,end=a[0][1];
		for(int i=1;i<n;i++)
		{
			if(a[i][0]<end)
				c++;
			else
				end=a[i][1];
		}
		System.out.print(c);
	}
}